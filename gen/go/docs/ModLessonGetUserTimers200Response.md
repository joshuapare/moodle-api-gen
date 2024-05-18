# ModLessonGetUserTimers200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Timers** | [**[]ModLessonGetUserTimers200ResponseTimersInner**](ModLessonGetUserTimers200ResponseTimersInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModLessonGetUserTimers200Response

`func NewModLessonGetUserTimers200Response(timers []ModLessonGetUserTimers200ResponseTimersInner, ) *ModLessonGetUserTimers200Response`

NewModLessonGetUserTimers200Response instantiates a new ModLessonGetUserTimers200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLessonGetUserTimers200ResponseWithDefaults

`func NewModLessonGetUserTimers200ResponseWithDefaults() *ModLessonGetUserTimers200Response`

NewModLessonGetUserTimers200ResponseWithDefaults instantiates a new ModLessonGetUserTimers200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTimers

`func (o *ModLessonGetUserTimers200Response) GetTimers() []ModLessonGetUserTimers200ResponseTimersInner`

GetTimers returns the Timers field if non-nil, zero value otherwise.

### GetTimersOk

`func (o *ModLessonGetUserTimers200Response) GetTimersOk() (*[]ModLessonGetUserTimers200ResponseTimersInner, bool)`

GetTimersOk returns a tuple with the Timers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimers

`func (o *ModLessonGetUserTimers200Response) SetTimers(v []ModLessonGetUserTimers200ResponseTimersInner)`

SetTimers sets Timers field to given value.


### GetWarnings

`func (o *ModLessonGetUserTimers200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModLessonGetUserTimers200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModLessonGetUserTimers200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModLessonGetUserTimers200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


