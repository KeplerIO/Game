package spriteeditor.entityhandling.defs.extras;

/**
 * Defines an animation
 */
public class AnimationDef {
	/**
	 * This animation's name
	 */
	public String name;
	/**
	 * This animation's number
	 */
	public int number;
	/**
	 * This animation's char colour
	 */
	private int charColour;
	/**
	 * This animation's gender model id
	 */
	private int genderModel;
	/**
	 * If this animation uses a.dat
	 */
	private boolean hasA;
	/**
	 * If this animation uses f.dat
	 */
	private boolean hasF;

	/**
	 * @return this animation's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return this animation's char colour
	 */
	public int getCharColour() {
		return charColour;
	}

	/**
	 * @return this animation's gender model
	 */
	public int getGenderModel() {
		return genderModel;
	}

	/**
	 * @return if this animation uses a.dat
	 */
	public boolean hasA() {
		return hasA;
	}

	/**
	 * @return if this animatiom uses f.dat
	 */
	public boolean hasF() {
		return hasF;
	}

	/**
	 * @return this animation's number
	 */
	public int getNumber() {
		return number;
	}
}
