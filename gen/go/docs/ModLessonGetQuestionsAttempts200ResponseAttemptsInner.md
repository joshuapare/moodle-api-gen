# ModLessonGetQuestionsAttempts200ResponseAttemptsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Answerid** | Pointer to **int32** | The attempt answerid | [optional] [default to null]
**Correct** | Pointer to **int32** | If it was the correct answer | [optional] [default to null]
**Id** | Pointer to **int32** | The attempt id | [optional] 
**Lessonid** | Pointer to **int32** | The attempt lessonid | [optional] [default to null]
**Pageid** | Pointer to **int32** | The attempt pageid | [optional] [default to null]
**Retry** | Pointer to **int32** | The lesson attempt number | [optional] [default to null]
**Timeseen** | Pointer to **int32** | The time the question was seen | [optional] [default to null]
**Useranswer** | Pointer to **string** | The complete user answer | [optional] [default to "null"]
**Userid** | Pointer to **int32** | The user who did the attempt | [optional] [default to null]

## Methods

### NewModLessonGetQuestionsAttempts200ResponseAttemptsInner

`func NewModLessonGetQuestionsAttempts200ResponseAttemptsInner() *ModLessonGetQuestionsAttempts200ResponseAttemptsInner`

NewModLessonGetQuestionsAttempts200ResponseAttemptsInner instantiates a new ModLessonGetQuestionsAttempts200ResponseAttemptsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetQuestionsAttempts200ResponseAttemptsInnerWithDefaults

`func NewModLessonGetQuestionsAttempts200ResponseAttemptsInnerWithDefaults() *ModLessonGetQuestionsAttempts200ResponseAttemptsInner`

NewModLessonGetQuestionsAttempts200ResponseAttemptsInnerWithDefaults instantiates a new ModLessonGetQuestionsAttempts200ResponseAttemptsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAnswerid

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) GetAnswerid() int32`

GetAnswerid returns the Answerid field if non-nil, zero value otherwise.

### GetAnsweridOk

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) GetAnsweridOk() (*int32, bool)`

GetAnsweridOk returns a tuple with the Answerid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAnswerid

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) SetAnswerid(v int32)`

SetAnswerid sets Answerid field to given value.

### HasAnswerid

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) HasAnswerid() bool`

HasAnswerid returns a boolean if a field has been set.

### GetCorrect

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) GetCorrect() int32`

GetCorrect returns the Correct field if non-nil, zero value otherwise.

### GetCorrectOk

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) GetCorrectOk() (*int32, bool)`

GetCorrectOk returns a tuple with the Correct field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCorrect

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) SetCorrect(v int32)`

SetCorrect sets Correct field to given value.

### HasCorrect

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) HasCorrect() bool`

HasCorrect returns a boolean if a field has been set.

### GetId

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLessonid

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) GetLessonid() int32`

GetLessonid returns the Lessonid field if non-nil, zero value otherwise.

### GetLessonidOk

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) GetLessonidOk() (*int32, bool)`

GetLessonidOk returns a tuple with the Lessonid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLessonid

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) SetLessonid(v int32)`

SetLessonid sets Lessonid field to given value.

### HasLessonid

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) HasLessonid() bool`

HasLessonid returns a boolean if a field has been set.

### GetPageid

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) GetPageid() int32`

GetPageid returns the Pageid field if non-nil, zero value otherwise.

### GetPageidOk

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) GetPageidOk() (*int32, bool)`

GetPageidOk returns a tuple with the Pageid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPageid

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) SetPageid(v int32)`

SetPageid sets Pageid field to given value.

### HasPageid

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) HasPageid() bool`

HasPageid returns a boolean if a field has been set.

### GetRetry

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) GetRetry() int32`

GetRetry returns the Retry field if non-nil, zero value otherwise.

### GetRetryOk

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) GetRetryOk() (*int32, bool)`

GetRetryOk returns a tuple with the Retry field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRetry

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) SetRetry(v int32)`

SetRetry sets Retry field to given value.

### HasRetry

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) HasRetry() bool`

HasRetry returns a boolean if a field has been set.

### GetTimeseen

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) GetTimeseen() int32`

GetTimeseen returns the Timeseen field if non-nil, zero value otherwise.

### GetTimeseenOk

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) GetTimeseenOk() (*int32, bool)`

GetTimeseenOk returns a tuple with the Timeseen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeseen

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) SetTimeseen(v int32)`

SetTimeseen sets Timeseen field to given value.

### HasTimeseen

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) HasTimeseen() bool`

HasTimeseen returns a boolean if a field has been set.

### GetUseranswer

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) GetUseranswer() string`

GetUseranswer returns the Useranswer field if non-nil, zero value otherwise.

### GetUseranswerOk

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) GetUseranswerOk() (*string, bool)`

GetUseranswerOk returns a tuple with the Useranswer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseranswer

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) SetUseranswer(v string)`

SetUseranswer sets Useranswer field to given value.

### HasUseranswer

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) HasUseranswer() bool`

HasUseranswer returns a boolean if a field has been set.

### GetUserid

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModLessonGetQuestionsAttempts200ResponseAttemptsInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


