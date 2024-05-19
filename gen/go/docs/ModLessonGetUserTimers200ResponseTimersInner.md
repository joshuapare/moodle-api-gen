# ModLessonGetUserTimers200ResponseTimersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Completed** | Pointer to **int32** | If the lesson for this timer was completed | [optional] [default to null]
**Id** | Pointer to **int32** | The attempt id | [optional] 
**Lessonid** | Pointer to **int32** | The lesson id | [optional] [default to null]
**Lessontime** | Pointer to **int32** | Last access time to the lesson during the timer session | [optional] [default to null]
**Starttime** | Pointer to **int32** | First access time for a new timer session | [optional] [default to null]
**Timemodifiedoffline** | Pointer to **int32** | Last modified time via webservices. | [optional] [default to null]
**Userid** | Pointer to **int32** | The user id | [optional] 

## Methods

### NewModLessonGetUserTimers200ResponseTimersInner

`func NewModLessonGetUserTimers200ResponseTimersInner() *ModLessonGetUserTimers200ResponseTimersInner`

NewModLessonGetUserTimers200ResponseTimersInner instantiates a new ModLessonGetUserTimers200ResponseTimersInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetUserTimers200ResponseTimersInnerWithDefaults

`func NewModLessonGetUserTimers200ResponseTimersInnerWithDefaults() *ModLessonGetUserTimers200ResponseTimersInner`

NewModLessonGetUserTimers200ResponseTimersInnerWithDefaults instantiates a new ModLessonGetUserTimers200ResponseTimersInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompleted

`func (o *ModLessonGetUserTimers200ResponseTimersInner) GetCompleted() int32`

GetCompleted returns the Completed field if non-nil, zero value otherwise.

### GetCompletedOk

`func (o *ModLessonGetUserTimers200ResponseTimersInner) GetCompletedOk() (*int32, bool)`

GetCompletedOk returns a tuple with the Completed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompleted

`func (o *ModLessonGetUserTimers200ResponseTimersInner) SetCompleted(v int32)`

SetCompleted sets Completed field to given value.

### HasCompleted

`func (o *ModLessonGetUserTimers200ResponseTimersInner) HasCompleted() bool`

HasCompleted returns a boolean if a field has been set.

### GetId

`func (o *ModLessonGetUserTimers200ResponseTimersInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModLessonGetUserTimers200ResponseTimersInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModLessonGetUserTimers200ResponseTimersInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModLessonGetUserTimers200ResponseTimersInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetLessonid

`func (o *ModLessonGetUserTimers200ResponseTimersInner) GetLessonid() int32`

GetLessonid returns the Lessonid field if non-nil, zero value otherwise.

### GetLessonidOk

`func (o *ModLessonGetUserTimers200ResponseTimersInner) GetLessonidOk() (*int32, bool)`

GetLessonidOk returns a tuple with the Lessonid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLessonid

`func (o *ModLessonGetUserTimers200ResponseTimersInner) SetLessonid(v int32)`

SetLessonid sets Lessonid field to given value.

### HasLessonid

`func (o *ModLessonGetUserTimers200ResponseTimersInner) HasLessonid() bool`

HasLessonid returns a boolean if a field has been set.

### GetLessontime

`func (o *ModLessonGetUserTimers200ResponseTimersInner) GetLessontime() int32`

GetLessontime returns the Lessontime field if non-nil, zero value otherwise.

### GetLessontimeOk

`func (o *ModLessonGetUserTimers200ResponseTimersInner) GetLessontimeOk() (*int32, bool)`

GetLessontimeOk returns a tuple with the Lessontime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLessontime

`func (o *ModLessonGetUserTimers200ResponseTimersInner) SetLessontime(v int32)`

SetLessontime sets Lessontime field to given value.

### HasLessontime

`func (o *ModLessonGetUserTimers200ResponseTimersInner) HasLessontime() bool`

HasLessontime returns a boolean if a field has been set.

### GetStarttime

`func (o *ModLessonGetUserTimers200ResponseTimersInner) GetStarttime() int32`

GetStarttime returns the Starttime field if non-nil, zero value otherwise.

### GetStarttimeOk

`func (o *ModLessonGetUserTimers200ResponseTimersInner) GetStarttimeOk() (*int32, bool)`

GetStarttimeOk returns a tuple with the Starttime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStarttime

`func (o *ModLessonGetUserTimers200ResponseTimersInner) SetStarttime(v int32)`

SetStarttime sets Starttime field to given value.

### HasStarttime

`func (o *ModLessonGetUserTimers200ResponseTimersInner) HasStarttime() bool`

HasStarttime returns a boolean if a field has been set.

### GetTimemodifiedoffline

`func (o *ModLessonGetUserTimers200ResponseTimersInner) GetTimemodifiedoffline() int32`

GetTimemodifiedoffline returns the Timemodifiedoffline field if non-nil, zero value otherwise.

### GetTimemodifiedofflineOk

`func (o *ModLessonGetUserTimers200ResponseTimersInner) GetTimemodifiedofflineOk() (*int32, bool)`

GetTimemodifiedofflineOk returns a tuple with the Timemodifiedoffline field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodifiedoffline

`func (o *ModLessonGetUserTimers200ResponseTimersInner) SetTimemodifiedoffline(v int32)`

SetTimemodifiedoffline sets Timemodifiedoffline field to given value.

### HasTimemodifiedoffline

`func (o *ModLessonGetUserTimers200ResponseTimersInner) HasTimemodifiedoffline() bool`

HasTimemodifiedoffline returns a boolean if a field has been set.

### GetUserid

`func (o *ModLessonGetUserTimers200ResponseTimersInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModLessonGetUserTimers200ResponseTimersInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModLessonGetUserTimers200ResponseTimersInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModLessonGetUserTimers200ResponseTimersInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


