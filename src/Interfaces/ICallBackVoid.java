package Interfaces;

import java.sql.SQLException;

@FunctionalInterface
public interface ICallBackVoid {
    void exec() throws SQLException;
}
