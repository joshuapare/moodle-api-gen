

# ModQuizGetAttemptData200ResponseAttempt


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attempt** | **Integer** | Sequentially numbers this students attempts at this quiz. |  [optional] |
|**currentpage** | **Integer** | Attempt current page. |  [optional] |
|**gradednotificationsenttime** | **Integer** | Time when the student was notified that manual grading of their attempt was complete. |  [optional] |
|**id** | **Integer** | Attempt id. |  [optional] |
|**layout** | **String** | Attempt layout. |  [optional] |
|**preview** | **Integer** | Whether is a preview attempt or not. |  [optional] |
|**quiz** | **Integer** | Foreign key reference to the quiz that was attempted. |  [optional] |
|**state** | **String** | The current state of the attempts. &#39;inprogress&#39;,                                                 &#39;overdue&#39;, &#39;finished&#39; or &#39;abandoned&#39;. |  [optional] |
|**sumgrades** | **BigDecimal** | Total marks for this attempt. |  [optional] |
|**timecheckstate** | **Integer** | Next time quiz cron should check attempt for                                                         state changes.  NULL means never check. |  [optional] |
|**timefinish** | **Integer** | Time when the attempt was submitted.                                                     0 if the attempt has not been submitted yet. |  [optional] |
|**timemodified** | **Integer** | Last modified time. |  [optional] |
|**timemodifiedoffline** | **Integer** | Last modified time via webservices. |  [optional] |
|**timestart** | **Integer** | Time when the attempt was started. |  [optional] |
|**uniqueid** | **Integer** | Foreign key reference to the question_usage that holds the                                                     details of the the question_attempts that make up this quiz                                                     attempt. |  [optional] |
|**userid** | **Integer** | Foreign key reference to the user whose attempt this is. |  [optional] |



