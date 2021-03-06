/*
 * The MIT License
 *
 * Copyright 2015 William A. Norman (LordCrekit@gmail.com, normanwi@msu.edu).
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.lordcrekit.JEasy.image;

import java.awt.Image;
import java.awt.image.BufferedImage;

/**
 * Special image operations.
 *
 * @author William A. Norman (LordCrekit@gmail.com, normanwi@msu.edu)
 */
public class ImageResizing {

    /**
     * Effectively a copy constructor for BufferedImage.
     *
     * @param orig The image to copy.
     * @return The copied image.
     */
    public static BufferedImage deepCopy(Image orig) {
        throw new UnsupportedOperationException();
    }

    /**
     * Scale down an image, preserving aspect ratio, until both width and height are at most the given values.
     *
     * @param image The image to scale.
     * @param maxWidth The maximum width for the final image.
     * @param maxHeight  The maximum height for the final image.
     * @return The scaled image.
     */
    public static Image scaleDownImage(BufferedImage image, int maxWidth, int maxHeight) {    // TODO: Run this through the gauntlet.
        if (image.getWidth() <= maxWidth && image.getHeight() <= maxHeight) // Neither is too large
            return image;
        else if (image.getWidth() > image.getHeight())   // Width is larger
            return image.getScaledInstance(maxWidth, (int) ((double) maxWidth / (double) image.getWidth() * (double) image.getHeight()), BufferedImage.SCALE_DEFAULT);
        else    // Height is larger
            return image.getScaledInstance((int) ((double) maxHeight / (double) image.getHeight() * (double) image.getWidth()), maxHeight, BufferedImage.SCALE_DEFAULT);
    }

    /**
     * Scale up an image, preserving aspect ratio, until both width and height are at least the values given.
     *
     * @param image The image to scale.
     * @param minWidth The minimum width for the final image.
     * @param minHeight The maximum height for the final image.
     * @return The scaled image.
     */
    public static Image scaleUpImage(BufferedImage image, int minWidth, int minHeight) {
        throw new UnsupportedOperationException();
    }
}
