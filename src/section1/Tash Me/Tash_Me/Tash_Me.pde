PImage mustache;
PImage friend;

void setup() {
friend = loadImage("Mike Tash.jpg");
size(800, 600);
friend.resize(width,height);
mustache = loadImage("moustache.png");
mustache.resize(150,150);

}

void draw() {
background(friend);
image(mustache, 150, 400);
}
