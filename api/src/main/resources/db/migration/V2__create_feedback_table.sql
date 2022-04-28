create table if not exists kata_feedback
(
    kata_feedback_id UUID PRIMARY KEY,
    feedback         TEXT,
    created_at       TIMESTAMP        DEFAULT now()
)