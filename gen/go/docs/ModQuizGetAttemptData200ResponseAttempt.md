# ModQuizGetAttemptData200ResponseAttempt

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attempt** | Pointer to **int32** | Sequentially numbers this students attempts at this quiz. | [optional] [default to null]
**Currentpage** | Pointer to **int32** | Attempt current page. | [optional] [default to null]
**Gradednotificationsenttime** | Pointer to **int32** | Time when the student was notified that manual grading of their attempt was complete. | [optional] [default to null]
**Id** | Pointer to **int32** | Attempt id. | [optional] [default to null]
**Layout** | Pointer to **string** | Attempt layout. | [optional] [default to "null"]
**Preview** | Pointer to **int32** | Whether is a preview attempt or not. | [optional] [default to null]
**Quiz** | Pointer to **int32** | Foreign key reference to the quiz that was attempted. | [optional] [default to null]
**State** | Pointer to **string** | The current state of the attempts. &#39;inprogress&#39;,                                                 &#39;overdue&#39;, &#39;finished&#39; or &#39;abandoned&#39;. | [optional] [default to "null"]
**Sumgrades** | Pointer to **float32** | Total marks for this attempt. | [optional] [default to null]
**Timecheckstate** | Pointer to **int32** | Next time quiz cron should check attempt for                                                         state changes.  NULL means never check. | [optional] [default to null]
**Timefinish** | Pointer to **int32** | Time when the attempt was submitted.                                                     0 if the attempt has not been submitted yet. | [optional] [default to null]
**Timemodified** | Pointer to **int32** | Last modified time. | [optional] [default to null]
**Timemodifiedoffline** | Pointer to **int32** | Last modified time via webservices. | [optional] 
**Timestart** | Pointer to **int32** | Time when the attempt was started. | [optional] [default to null]
**Uniqueid** | Pointer to **int32** | Foreign key reference to the question_usage that holds the                                                     details of the the question_attempts that make up this quiz                                                     attempt. | [optional] [default to null]
**Userid** | Pointer to **int32** | Foreign key reference to the user whose attempt this is. | [optional] [default to null]

## Methods

### NewModQuizGetAttemptData200ResponseAttempt

`func NewModQuizGetAttemptData200ResponseAttempt() *ModQuizGetAttemptData200ResponseAttempt`

NewModQuizGetAttemptData200ResponseAttempt instantiates a new ModQuizGetAttemptData200ResponseAttempt object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModQuizGetAttemptData200ResponseAttemptWithDefaults

`func NewModQuizGetAttemptData200ResponseAttemptWithDefaults() *ModQuizGetAttemptData200ResponseAttempt`

NewModQuizGetAttemptData200ResponseAttemptWithDefaults instantiates a new ModQuizGetAttemptData200ResponseAttempt object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttempt

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetAttempt() int32`

GetAttempt returns the Attempt field if non-nil, zero value otherwise.

### GetAttemptOk

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetAttemptOk() (*int32, bool)`

GetAttemptOk returns a tuple with the Attempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttempt

`func (o *ModQuizGetAttemptData200ResponseAttempt) SetAttempt(v int32)`

SetAttempt sets Attempt field to given value.

### HasAttempt

`func (o *ModQuizGetAttemptData200ResponseAttempt) HasAttempt() bool`

HasAttempt returns a boolean if a field has been set.

### GetCurrentpage

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetCurrentpage() int32`

GetCurrentpage returns the Currentpage field if non-nil, zero value otherwise.

### GetCurrentpageOk

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetCurrentpageOk() (*int32, bool)`

GetCurrentpageOk returns a tuple with the Currentpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrentpage

`func (o *ModQuizGetAttemptData200ResponseAttempt) SetCurrentpage(v int32)`

SetCurrentpage sets Currentpage field to given value.

### HasCurrentpage

`func (o *ModQuizGetAttemptData200ResponseAttempt) HasCurrentpage() bool`

HasCurrentpage returns a boolean if a field has been set.

### GetGradednotificationsenttime

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetGradednotificationsenttime() int32`

GetGradednotificationsenttime returns the Gradednotificationsenttime field if non-nil, zero value otherwise.

### GetGradednotificationsenttimeOk

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetGradednotificationsenttimeOk() (*int32, bool)`

GetGradednotificationsenttimeOk returns a tuple with the Gradednotificationsenttime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradednotificationsenttime

`func (o *ModQuizGetAttemptData200ResponseAttempt) SetGradednotificationsenttime(v int32)`

SetGradednotificationsenttime sets Gradednotificationsenttime field to given value.

### HasGradednotificationsenttime

`func (o *ModQuizGetAttemptData200ResponseAttempt) HasGradednotificationsenttime() bool`

HasGradednotificationsenttime returns a boolean if a field has been set.

### GetId

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModQuizGetAttemptData200ResponseAttempt) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModQuizGetAttemptData200ResponseAttempt) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLayout

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetLayout() string`

GetLayout returns the Layout field if non-nil, zero value otherwise.

### GetLayoutOk

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetLayoutOk() (*string, bool)`

GetLayoutOk returns a tuple with the Layout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLayout

`func (o *ModQuizGetAttemptData200ResponseAttempt) SetLayout(v string)`

SetLayout sets Layout field to given value.

### HasLayout

`func (o *ModQuizGetAttemptData200ResponseAttempt) HasLayout() bool`

HasLayout returns a boolean if a field has been set.

### GetPreview

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetPreview() int32`

GetPreview returns the Preview field if non-nil, zero value otherwise.

### GetPreviewOk

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetPreviewOk() (*int32, bool)`

GetPreviewOk returns a tuple with the Preview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreview

`func (o *ModQuizGetAttemptData200ResponseAttempt) SetPreview(v int32)`

SetPreview sets Preview field to given value.

### HasPreview

`func (o *ModQuizGetAttemptData200ResponseAttempt) HasPreview() bool`

HasPreview returns a boolean if a field has been set.

### GetQuiz

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetQuiz() int32`

GetQuiz returns the Quiz field if non-nil, zero value otherwise.

### GetQuizOk

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetQuizOk() (*int32, bool)`

GetQuizOk returns a tuple with the Quiz field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuiz

`func (o *ModQuizGetAttemptData200ResponseAttempt) SetQuiz(v int32)`

SetQuiz sets Quiz field to given value.

### HasQuiz

`func (o *ModQuizGetAttemptData200ResponseAttempt) HasQuiz() bool`

HasQuiz returns a boolean if a field has been set.

### GetState

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetState() string`

GetState returns the State field if non-nil, zero value otherwise.

### GetStateOk

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetStateOk() (*string, bool)`

GetStateOk returns a tuple with the State field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetState

`func (o *ModQuizGetAttemptData200ResponseAttempt) SetState(v string)`

SetState sets State field to given value.

### HasState

`func (o *ModQuizGetAttemptData200ResponseAttempt) HasState() bool`

HasState returns a boolean if a field has been set.

### GetSumgrades

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetSumgrades() float32`

GetSumgrades returns the Sumgrades field if non-nil, zero value otherwise.

### GetSumgradesOk

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetSumgradesOk() (*float32, bool)`

GetSumgradesOk returns a tuple with the Sumgrades field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSumgrades

`func (o *ModQuizGetAttemptData200ResponseAttempt) SetSumgrades(v float32)`

SetSumgrades sets Sumgrades field to given value.

### HasSumgrades

`func (o *ModQuizGetAttemptData200ResponseAttempt) HasSumgrades() bool`

HasSumgrades returns a boolean if a field has been set.

### GetTimecheckstate

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetTimecheckstate() int32`

GetTimecheckstate returns the Timecheckstate field if non-nil, zero value otherwise.

### GetTimecheckstateOk

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetTimecheckstateOk() (*int32, bool)`

GetTimecheckstateOk returns a tuple with the Timecheckstate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecheckstate

`func (o *ModQuizGetAttemptData200ResponseAttempt) SetTimecheckstate(v int32)`

SetTimecheckstate sets Timecheckstate field to given value.

### HasTimecheckstate

`func (o *ModQuizGetAttemptData200ResponseAttempt) HasTimecheckstate() bool`

HasTimecheckstate returns a boolean if a field has been set.

### GetTimefinish

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetTimefinish() int32`

GetTimefinish returns the Timefinish field if non-nil, zero value otherwise.

### GetTimefinishOk

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetTimefinishOk() (*int32, bool)`

GetTimefinishOk returns a tuple with the Timefinish field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimefinish

`func (o *ModQuizGetAttemptData200ResponseAttempt) SetTimefinish(v int32)`

SetTimefinish sets Timefinish field to given value.

### HasTimefinish

`func (o *ModQuizGetAttemptData200ResponseAttempt) HasTimefinish() bool`

HasTimefinish returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModQuizGetAttemptData200ResponseAttempt) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModQuizGetAttemptData200ResponseAttempt) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetTimemodifiedoffline

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetTimemodifiedoffline() int32`

GetTimemodifiedoffline returns the Timemodifiedoffline field if non-nil, zero value otherwise.

### GetTimemodifiedofflineOk

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetTimemodifiedofflineOk() (*int32, bool)`

GetTimemodifiedofflineOk returns a tuple with the Timemodifiedoffline field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodifiedoffline

`func (o *ModQuizGetAttemptData200ResponseAttempt) SetTimemodifiedoffline(v int32)`

SetTimemodifiedoffline sets Timemodifiedoffline field to given value.

### HasTimemodifiedoffline

`func (o *ModQuizGetAttemptData200ResponseAttempt) HasTimemodifiedoffline() bool`

HasTimemodifiedoffline returns a boolean if a field has been set.

### GetTimestart

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetTimestart() int32`

GetTimestart returns the Timestart field if non-nil, zero value otherwise.

### GetTimestartOk

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetTimestartOk() (*int32, bool)`

GetTimestartOk returns a tuple with the Timestart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestart

`func (o *ModQuizGetAttemptData200ResponseAttempt) SetTimestart(v int32)`

SetTimestart sets Timestart field to given value.

### HasTimestart

`func (o *ModQuizGetAttemptData200ResponseAttempt) HasTimestart() bool`

HasTimestart returns a boolean if a field has been set.

### GetUniqueid

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetUniqueid() int32`

GetUniqueid returns the Uniqueid field if non-nil, zero value otherwise.

### GetUniqueidOk

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetUniqueidOk() (*int32, bool)`

GetUniqueidOk returns a tuple with the Uniqueid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUniqueid

`func (o *ModQuizGetAttemptData200ResponseAttempt) SetUniqueid(v int32)`

SetUniqueid sets Uniqueid field to given value.

### HasUniqueid

`func (o *ModQuizGetAttemptData200ResponseAttempt) HasUniqueid() bool`

HasUniqueid returns a boolean if a field has been set.

### GetUserid

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModQuizGetAttemptData200ResponseAttempt) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModQuizGetAttemptData200ResponseAttempt) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModQuizGetAttemptData200ResponseAttempt) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


