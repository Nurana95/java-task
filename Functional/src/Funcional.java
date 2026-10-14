


    interface MyPredicate<T> {
        boolean test(T t);
    }

    interface MyFunction<T, R> {
        R apply(T t);
    }

    interface MyConsumer<T> {
        void accept(T t);
    }

    interface MySupplier<T> {
        T get();
    }

