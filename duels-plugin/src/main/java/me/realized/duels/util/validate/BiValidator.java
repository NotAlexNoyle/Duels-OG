package me.realized.duels.util.validate;

public interface BiValidator<T1, T2> {

    boolean shouldValidate();

    boolean validate(final T1 first, final T2 second);
}
