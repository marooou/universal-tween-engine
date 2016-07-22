package aurelienribon.tweenengine.deltas;

import aurelienribon.tweenengine.TweenDelta;

/**
 * A tween delta which does nothing and returns
 * an original delta time.
 */
public class NormalTweenDelta implements TweenDelta {

    /**
     * The instance of the {@link aurelienribon.tweenengine.deltas.NormalTweenDelta}.
     */
    public static final NormalTweenDelta INSTANCE = new NormalTweenDelta();

    private NormalTweenDelta() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public float adjustDelta(float delta) {
        return delta;
    }
}
