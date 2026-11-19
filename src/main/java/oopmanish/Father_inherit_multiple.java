package oopmanish;

interface Father_inherit_multiple {
    void property();
}

interface Mother {
    void money();
}
    class elderSon implements Father_inherit_multiple, Mother {
        public void property() {
            System.out.println("Father has property");
        }
        public void money() {
            System.out.println("Mother has money");
        }
    }
    class test5 {

        public static void main(String[] args) {

            elderSon s = new elderSon();

            s.property();
            s.money();
        }
    }
