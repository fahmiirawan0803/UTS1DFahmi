public class UTSMethodNoDua {
        public static void UbahHrufEToSTar(){
            String[] _Block = new String[]{"Triangle", "Cubes", "Circle"};
            char x;
            for (var i=0; i < _Block.length; i++){
                String huruf = _Block[i];
                if (huruf.contains("e")){
                    System.out.println(_Block[i].replace("e", "*"));
                }
            }
            System.out.println(_Block);
        }
        public static void main(String[] args) {
            UbahHrufEToSTar();
        }

}
