create table if not exists question
(
    question_id UUID PRIMARY KEY,
    user_id     UUID,
    question    TEXT,
    created_at  TIMESTAMP DEFAULT now()
);

create table question_possibility
(
    question_possibility_id UUID PRIMARY KEY,
    question_id             UUID,
    answer                  TEXT,
    question_order          INTEGER,
    created_at              TIMESTAMP DEFAULT now()
);

create table question_vote
(
    question_vote_id        UUID PRIMARY KEY,
    question_possibility_id UUID,
    user_id                 UUID,
    created_at              TIMESTAMP DEFAULT now()
);
