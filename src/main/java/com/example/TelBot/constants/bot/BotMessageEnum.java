package com.example.TelBot.constants.bot;

/**
 * Текстовые сообщения, посылаемые ботом
 */
public enum BotMessageEnum {

    HELP_MESSAGE("Привет я телеграмм бот для теста твоих домашних заданий"),

    EXCEPTION_ILLEGAL_MESSAGE("Нет, к такому меня не готовили! Я работаю или с текстом, или цифрами"),
    EXCEPTION_WHAT_THE_FUCK("Что-то пошло не так. Обратитесь к Дане :D "),

    NON_COMMAND_MESSAGE("Пожалуйста, воспользуйтесь клавиатурой");

    private final String message;

    BotMessageEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
