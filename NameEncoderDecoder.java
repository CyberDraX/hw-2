class NameEncoderDecoder {

  public String encode(String name) {
         String topSecretEncode = name
                .replace("e", "1")
                .replace("u", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("a", "5");
          return "NOTFORYOU" + topSecretEncode + "YESNOTFORYOU";
  }
  
  public String decode(String name) {
         String stepOne = name.replace("YESNOTFORYOU", "");
         String stepTwo = stepOne.replace("NOTFORYOU", "");
         String stepTree = stepTwo.strip();
         String topSecretDecode = stepTree
                .replace("1", "e")
                .replace("2", "u")
                .replace("3", "i")
                .replace("4", "0")
                .replace("5", "a");
         return topSecretDecode;
  }
  
}
