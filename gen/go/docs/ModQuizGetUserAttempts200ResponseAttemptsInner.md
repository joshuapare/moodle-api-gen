# ModQuizGetUserAttempts200ResponseAttemptsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attempt** | Pointer to **int32** | Sequentially numbers this students attempts at this quiz. | [optional] 
**Currentpage** | Pointer to **int32** | Attempt current page. | [optional] 
**Gradednotificationsenttime** | Pointer to **int32** | Time when the student was notified that manual grading of their attempt was complete. | [optional] 
**Id** | Pointer to **int32** | Attempt id. | [optional] 
**Layout** | Pointer to **string** | Attempt layout. | [optional] 
**Preview** | Pointer to **int32** | Whether is a preview attempt or not. | [optional] 
**Quiz** | Pointer to **int32** | Foreign key reference to the quiz that was attempted. | [optional] 
**State** | Pointer to **string** | The current state of the attempts. &#39;inprogress&#39;,                                                 &#39;overdue&#39;, &#39;finished&#39; or &#39;abandoned&#39;. | [optional] 
**Sumgrades** | Pointer to **float32** | Total marks for this attempt. | [optional] 
**Timecheckstate** | Pointer to **int32** | Next time quiz cron should check attempt for                                                         state changes.  NULL means never check. | [optional] 
**Timefinish** | Pointer to **int32** | Time when the attempt was submitted.                                                     0 if the attempt has not been submitted yet. | [optional] 
**Timemodified** | Pointer to **int32** | Last modified time. | [optional] 
**Timemodifiedoffline** | Pointer to **int32** | Last modified time via webservices. | [optional] 
**Timestart** | Pointer to **int32** | Time when the attempt was started. | [optional] 
**Uniqueid** | Pointer to **int32** | Foreign key reference to the question_usage that holds the                                                     details of the the question_attempts that make up this quiz                                                     attempt. | [optional] 
**Userid** | Pointer to **int32** | Foreign key reference to the user whose attempt this is. | [optional] 

## Methods

### NewModQuizGetUserAttempts200ResponseAttemptsInner

`func NewModQuizGetUserAttempts200ResponseAttemptsInner() *ModQuizGetUserAttempts200ResponseAttemptsInner`

NewModQuizGetUserAttempts200ResponseAttemptsInner instantiates a new ModQuizGetUserAttempts200ResponseAttemptsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizGetUserAttempts200ResponseAttemptsInnerWithDefaults

`func NewModQuizGetUserAttempts200ResponseAttemptsInnerWithDefaults() *ModQuizGetUserAttempts200ResponseAttemptsInner`

NewModQuizGetUserAttempts200ResponseAttemptsInnerWithDefaults instantiates a new ModQuizGetUserAttempts200ResponseAttemptsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttempt

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetAttempt() int32`

GetAttempt returns the Attempt field if non-nil, zero value otherwise.

### GetAttemptOk

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetAttemptOk() (*int32, bool)`

GetAttemptOk returns a tuple with the Attempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttempt

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) SetAttempt(v int32)`

SetAttempt sets Attempt field to given value.

### HasAttempt

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) HasAttempt() bool`

HasAttempt returns a boolean if a field has been set.

### GetCurrentpage

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetCurrentpage() int32`

GetCurrentpage returns the Currentpage field if non-nil, zero value otherwise.

### GetCurrentpageOk

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetCurrentpageOk() (*int32, bool)`

GetCurrentpageOk returns a tuple with the Currentpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrentpage

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) SetCurrentpage(v int32)`

SetCurrentpage sets Currentpage field to given value.

### HasCurrentpage

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) HasCurrentpage() bool`

HasCurrentpage returns a boolean if a field has been set.

### GetGradednotificationsenttime

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetGradednotificationsenttime() int32`

GetGradednotificationsenttime returns the Gradednotificationsenttime field if non-nil, zero value otherwise.

### GetGradednotificationsenttimeOk

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetGradednotificationsenttimeOk() (*int32, bool)`

GetGradednotificationsenttimeOk returns a tuple with the Gradednotificationsenttime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradednotificationsenttime

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) SetGradednotificationsenttime(v int32)`

SetGradednotificationsenttime sets Gradednotificationsenttime field to given value.

### HasGradednotificationsenttime

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) HasGradednotificationsenttime() bool`

HasGradednotificationsenttime returns a boolean if a field has been set.

### GetId

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLayout

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetLayout() string`

GetLayout returns the Layout field if non-nil, zero value otherwise.

### GetLayoutOk

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetLayoutOk() (*string, bool)`

GetLayoutOk returns a tuple with the Layout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLayout

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) SetLayout(v string)`

SetLayout sets Layout field to given value.

### HasLayout

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) HasLayout() bool`

HasLayout returns a boolean if a field has been set.

### GetPreview

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetPreview() int32`

GetPreview returns the Preview field if non-nil, zero value otherwise.

### GetPreviewOk

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetPreviewOk() (*int32, bool)`

GetPreviewOk returns a tuple with the Preview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreview

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) SetPreview(v int32)`

SetPreview sets Preview field to given value.

### HasPreview

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) HasPreview() bool`

HasPreview returns a boolean if a field has been set.

### GetQuiz

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetQuiz() int32`

GetQuiz returns the Quiz field if non-nil, zero value otherwise.

### GetQuizOk

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetQuizOk() (*int32, bool)`

GetQuizOk returns a tuple with the Quiz field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuiz

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) SetQuiz(v int32)`

SetQuiz sets Quiz field to given value.

### HasQuiz

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) HasQuiz() bool`

HasQuiz returns a boolean if a field has been set.

### GetState

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetState() string`

GetState returns the State field if non-nil, zero value otherwise.

### GetStateOk

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetStateOk() (*string, bool)`

GetStateOk returns a tuple with the State field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetState

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) SetState(v string)`

SetState sets State field to given value.

### HasState

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) HasState() bool`

HasState returns a boolean if a field has been set.

### GetSumgrades

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetSumgrades() float32`

GetSumgrades returns the Sumgrades field if non-nil, zero value otherwise.

### GetSumgradesOk

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetSumgradesOk() (*float32, bool)`

GetSumgradesOk returns a tuple with the Sumgrades field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSumgrades

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) SetSumgrades(v float32)`

SetSumgrades sets Sumgrades field to given value.

### HasSumgrades

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) HasSumgrades() bool`

HasSumgrades returns a boolean if a field has been set.

### GetTimecheckstate

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetTimecheckstate() int32`

GetTimecheckstate returns the Timecheckstate field if non-nil, zero value otherwise.

### GetTimecheckstateOk

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetTimecheckstateOk() (*int32, bool)`

GetTimecheckstateOk returns a tuple with the Timecheckstate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecheckstate

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) SetTimecheckstate(v int32)`

SetTimecheckstate sets Timecheckstate field to given value.

### HasTimecheckstate

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) HasTimecheckstate() bool`

HasTimecheckstate returns a boolean if a field has been set.

### GetTimefinish

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetTimefinish() int32`

GetTimefinish returns the Timefinish field if non-nil, zero value otherwise.

### GetTimefinishOk

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetTimefinishOk() (*int32, bool)`

GetTimefinishOk returns a tuple with the Timefinish field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimefinish

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) SetTimefinish(v int32)`

SetTimefinish sets Timefinish field to given value.

### HasTimefinish

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) HasTimefinish() bool`

HasTimefinish returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetTimemodifiedoffline

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetTimemodifiedoffline() int32`

GetTimemodifiedoffline returns the Timemodifiedoffline field if non-nil, zero value otherwise.

### GetTimemodifiedofflineOk

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetTimemodifiedofflineOk() (*int32, bool)`

GetTimemodifiedofflineOk returns a tuple with the Timemodifiedoffline field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodifiedoffline

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) SetTimemodifiedoffline(v int32)`

SetTimemodifiedoffline sets Timemodifiedoffline field to given value.

### HasTimemodifiedoffline

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) HasTimemodifiedoffline() bool`

HasTimemodifiedoffline returns a boolean if a field has been set.

### GetTimestart

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetTimestart() int32`

GetTimestart returns the Timestart field if non-nil, zero value otherwise.

### GetTimestartOk

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetTimestartOk() (*int32, bool)`

GetTimestartOk returns a tuple with the Timestart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestart

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) SetTimestart(v int32)`

SetTimestart sets Timestart field to given value.

### HasTimestart

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) HasTimestart() bool`

HasTimestart returns a boolean if a field has been set.

### GetUniqueid

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetUniqueid() int32`

GetUniqueid returns the Uniqueid field if non-nil, zero value otherwise.

### GetUniqueidOk

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetUniqueidOk() (*int32, bool)`

GetUniqueidOk returns a tuple with the Uniqueid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUniqueid

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) SetUniqueid(v int32)`

SetUniqueid sets Uniqueid field to given value.

### HasUniqueid

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) HasUniqueid() bool`

HasUniqueid returns a boolean if a field has been set.

### GetUserid

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModQuizGetUserAttempts200ResponseAttemptsInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


