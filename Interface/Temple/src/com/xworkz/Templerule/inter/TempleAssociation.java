package com.xworkz.Templerule.inter;

public class TempleAssociation {
	private DevoteeRule devoteerule;
	private String associationname;

	public TempleAssociation() {
		System.out.println("invoked no arg const");
	}

	public TempleAssociation(DevoteeRule devoteerule2, String associationname) {
		super();
		this.associationname = associationname;
		this.devoteerule = devoteerule2;

	}

	public void allowDevotees() {
		System.out.println("invoked devotees");
		if (this.devoteerule != null) {
			System.out.println("dvotes enterd");
			boolean slippersoff = this.devoteerule.slippersOff();
			if (slippersoff) 
			{
				System.out.println("slippers are off");
				boolean Mainsilence = this.devoteerule.maintainsilence();
					boolean Donttakephoto = this.devoteerule.donttakephoto();
					if(Donttakephoto && Mainsilence) {
						System.out.println("good devotes");
					} else {
						System.err.println("bad devotes");
					}
				} else {
					System.out.println("plz liv the slippers outside");
				}
			} else {
				System.out.println("give the rules");
			}

		}
	}

