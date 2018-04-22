package Entities;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import flappytin.ResourceLoader;

public class TinCan implements Entity {
	
	private Point position = new Point();
	private Dimension size = new Dimension();
	
	private ArrayList<Image> states = new ArrayList<Image>();
	private int currentState = 1; // normal state of tincan
	
	public TinCan() {
		states.add((Image) ResourceLoader.LOADED_ASSETS.get("Tin_Can_LEFT.png"));
		states.add((Image) ResourceLoader.LOADED_ASSETS.get("Tin_Can.png"));
		states.add((Image) ResourceLoader.LOADED_ASSETS.get("Tin_Can_RIGHT.png"));
		
		BufferedImage tinCanNormal = new BufferedImage(75, 100, BufferedImage.TYPE_4BYTE_ABGR);
		size.setSize(tinCanNormal.getWidth(), tinCanNormal.getHeight());
		System.out.println(tinCanNormal.getWidth());
	}
	
	public void setPosition(int x, int y) {
		this.position.setLocation(x, y);
	}
	
	public void setState(int state) {
		this.currentState = state;
	}
	
	public int getWidth() {
		return size.width;
	}
	
	public int getHeight() {
		return size.height;
	}
	
	public int getX() {
		return position.x;
	}
	
	public int getY() {
		return position.y;
	}
	
	@Override
	public void draw(Graphics2D g) {
		g.drawImage(states.get(currentState), position.x, position.y, null);
		g.translate(position.x + 40, position.y);
		g.rotate(Math.toRadians(35));
		Rectangle hitBox = new Rectangle(0,0, 65, 90);
		
		g.draw(hitBox);
	}
	
}
