package fedorov;

enum color{
	red,
	blue,
	white,
	black,
	orange,
	purple,
	pink
}
enum size{
	big,
	medium,
	small
}

public class ball {
	float weight;
	color color;
	size size;
	
	public ball(float weight, fedorov.color color, fedorov.size size) {
		this.weight = weight;
		this.color = color;
		this.size = size;
	}
}
