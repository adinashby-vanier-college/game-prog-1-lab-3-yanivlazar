// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class CrabWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class CrabWorld.
     */
    public CrabWorld()
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab =  new  Crab();
        addObject(crab, 138, 167);
        Lobster lobster =  new  Lobster();
        addObject(lobster, 463, 231);
        worm worm =  new  worm();
        addObject(worm, 256, 358);
    }
}
