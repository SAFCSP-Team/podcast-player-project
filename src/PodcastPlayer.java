public class PodcastPlayer {
  Node top;
  Node start;
  PodcastPlayer(){
      this.top = null;
      this.start = null;
  }

  public boolean isEmpty(){
      if (this.top == null){
          return true;
      }return false;
  }
  public void add(String name, String channel, String speaker, String guests , double duration)
      {
          Node newNode = new Node(new Podcast(name, channel, speaker, guests , duration));
          if (isEmpty()) {
              newNode.prev = null;
              newNode.next = null;
      
              // As it is first node
              // if stack is empty
               this.start = newNode;
              this.top = newNode;
          }
          else {
              this.top.next = newNode;
              newNode.next = null;
              newNode.prev = this.top;
              this.top = newNode;
              System.out.println("new podcast");
          }
      }
  public void play(){
      if(isEmpty()){
          System.out.println("there is nothing to play");
      }else{
          System.out.println("podcast name: "+ this.top.pod.name+ " podcast channel: "+ this.top.pod.channel + "podcast speaker: "+ this.top.pod.speaker + " podcast guest: " + this.top.pod.guests + " podcast duration"+ this.top.pod.duration);
      }
  }
  public void previous(){
    if(this.top == this.start){
        System.out.println("going back is impossible");
    }else{
        this.top = this.top.prev;
        play();
    }
}
public void printAll(){
    Node curr = this.top;
    while(curr != null){
        System.out.println("podcast name: "+ curr.pod.name +  " podcast speaker: "+ curr.pod.speaker + " podcast guest: " + curr.pod.guests + " podcast duration"+ curr.pod.duration);
        curr = curr.prev;
    }
}

  }
