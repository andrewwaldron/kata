create table if not exists kata_feedback
(
    kata_feedback_id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    feedback         TEXT,
    created_at       TIMESTAMP        DEFAULT now()
)