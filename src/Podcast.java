public class Podcast {
    String name;
    String channel;
    String speaker;
    String guests ;
    double duration;
  
    Podcast(String name, String channel, String speaker, String guests , double duration){
      this.name = name;
      this.channel = channel;
      this.speaker = speaker;
      this.guests  = guests ;
      this. duration = duration;
  
    }
  
      public static void main(String[] args) {
        PodcastPlayer obj = new PodcastPlayer();
        obj.add("joe rogan podcast", "joe rogan", "joe rogan", "mike tyson", 1.22);
        obj.add("joe rogan podcast", "joe rogan", "joe rogan", "Trump", 1.45);
        obj.add("joe rogan podcast", "joe rogan", "joe rogan", "neil anderson", 1.44);
        obj.add("joe rogan podcast", "joe rogan", "joe rogan", "ronaldo", 1.56);
        obj.add("joe rogan podcast", "joe rogan", "joe rogan", "khalid alqahtani", 1.32);
        obj.add("joe rogan podcast", "joe rogan", "joe rogan", "dc", 1.11);
        obj.add("joe rogan podcast", "joe rogan", "joe rogan", "jon jones", 1.44);
        obj.add("joe rogan podcast", "joe rogan", "joe rogan", "dana white", 1.33);
        obj.add("joe rogan podcast", "joe rogan", "joe rogan", "elon musk", 1.54);
        obj.add("joe rogan podcast", "joe rogan", "joe rogan", "messi", 1.59);
        obj.printAll();
        System.out.println("------------------------ \n \n");
        obj.play();
        System.out.println("------------------------ \n \n");
        obj.previous();
        System.out.println("------------------------ \n \n");
        obj.printAll();
  
        
      }
    }