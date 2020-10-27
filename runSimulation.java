public class runSimulation {

  public static void main(String[] args) {
    Colony colo = new Colony();
		Colony colo2 = new Colony();
		Ant ant1 = new Ant(colo), ant3 = new Ant(colo), ant4 = new Ant(colo), ant5 = new Ant(colo);
		Ant ant2 = new Ant(colo2), ant6 = new Ant(colo2);

		Colony [] c = {colo, colo2};
		Ant [] a = {ant1, ant2, ant3, ant4, ant5, ant6};
		Graph graph = new Graph(10,6, c ,0.1, 1);

		Simulator sim = new Simulator(graph, a, 2, 1);
		Visualizer vis = new Visualizer(graph, true, ant1.home() ,a);


		int i = 0;
		System.out.println( );
		do{
			for (int e=0 ; e<a.length; e++){
			System.out.println(a[e].current());
			}
			System.out.println(colo.hasStock());

			System.out.println(colo2.hasStock());

			vis.update();
			vis.display();

			graph.tick();
			sim.tick();

			i = i+1;

		}while(i<=100);

	}

}
