package homeworks;

public enum WhatTheError {
    INFO(100,101,102,103),
    SUCCESS(200,201,202),
    REDIRECTION(300,301,302),
    CLIENTERROR(400,401,402);

    WhatTheError(int i, int i1, int i2, int i3) {}

    WhatTheError(int i, int i1, int i2) {}
}
