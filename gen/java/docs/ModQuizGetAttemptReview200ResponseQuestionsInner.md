

# ModQuizGetAttemptReview200ResponseQuestionsInner

The question data. Some fields may not be returned depending on the quiz display settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blockedbyprevious** | **Boolean** | whether the question is blocked by the previous question |  [optional] |
|**flagged** | **Boolean** | whether the question is flagged or not |  [optional] |
|**hasautosavedstep** | **Boolean** | whether this question attempt has autosaved data |  [optional] |
|**html** | **String** | the question rendered |  [optional] |
|**lastactiontime** | **Integer** | the timestamp of the most recent step in this question attempt |  [optional] |
|**mark** | **String** | the mark awarded.                     It will be returned only if the user is allowed to see it. |  [optional] |
|**maxmark** | **BigDecimal** | the maximum mark possible for this question attempt.                     It will be returned only if the user is allowed to see it. |  [optional] |
|**number** | **Integer** | DO NOT USE. Use questionnumber. Only retained for backwards compatibility. |  [optional] |
|**page** | **Integer** | page of the quiz this question appears on |  [optional] |
|**questionnumber** | **String** | The question number to display for this question, e.g. \&quot;7\&quot;, \&quot;i\&quot; or \&quot;Custom-B)\&quot;. |  [optional] |
|**responsefileareas** | [**List&lt;ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner&gt;**](ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner.md) |  |  [optional] |
|**sequencecheck** | **Integer** | the number of real steps in this attempt |  [optional] |
|**settings** | **String** | Question settings (JSON encoded). |  [optional] |
|**slot** | **Integer** | slot number |  [optional] |
|**state** | **String** | the state where the question is in.                     It will not be returned if the user cannot see it due to the quiz display correctness settings. |  [optional] |
|**status** | **String** | current formatted state of the question |  [optional] |
|**type** | **String** | question type, i.e: multichoice |  [optional] |



