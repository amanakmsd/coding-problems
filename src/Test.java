class Test{
    public Test(){
    }
}
class B {
    void test() {
        Test generated;
        try {
            generated = Test.class.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            generated = null;
        }
    }

    public static void main(String[] args) {
        new B().test();
    }
}