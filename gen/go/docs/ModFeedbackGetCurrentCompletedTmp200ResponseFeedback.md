# ModFeedbackGetCurrentCompletedTmp200ResponseFeedback

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AnonymousResponse** | **int32** | Whether is an anonymous response. | [default to null]
**Courseid** | **int32** | The course id where the feedback was completed. | [default to null]
**Feedback** | **int32** | The feedback instance id this records belongs to. | [default to null]
**Guestid** | **string** | For guests, this is the session key. | [default to "null"]
**Id** | **int32** | The record id. | 
**RandomResponse** | **int32** | The response number (used when shuffling anonymous responses). | [default to null]
**Timemodified** | **int32** | The last time the feedback was completed. | [default to null]
**Userid** | **int32** | The user who completed the feedback (0 for anonymous). | [default to null]

## Methods

### NewModFeedbackGetCurrentCompletedTmp200ResponseFeedback

`func NewModFeedbackGetCurrentCompletedTmp200ResponseFeedback(anonymousResponse int32, courseid int32, feedback int32, guestid string, id int32, randomResponse int32, timemodified int32, userid int32, ) *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback`

NewModFeedbackGetCurrentCompletedTmp200ResponseFeedback instantiates a new ModFeedbackGetCurrentCompletedTmp200ResponseFeedback object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackGetCurrentCompletedTmp200ResponseFeedbackWithDefaults

`func NewModFeedbackGetCurrentCompletedTmp200ResponseFeedbackWithDefaults() *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback`

NewModFeedbackGetCurrentCompletedTmp200ResponseFeedbackWithDefaults instantiates a new ModFeedbackGetCurrentCompletedTmp200ResponseFeedback object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAnonymousResponse

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) GetAnonymousResponse() int32`

GetAnonymousResponse returns the AnonymousResponse field if non-nil, zero value otherwise.

### GetAnonymousResponseOk

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) GetAnonymousResponseOk() (*int32, bool)`

GetAnonymousResponseOk returns a tuple with the AnonymousResponse field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAnonymousResponse

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) SetAnonymousResponse(v int32)`

SetAnonymousResponse sets AnonymousResponse field to given value.


### GetCourseid

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetFeedback

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) GetFeedback() int32`

GetFeedback returns the Feedback field if non-nil, zero value otherwise.

### GetFeedbackOk

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) GetFeedbackOk() (*int32, bool)`

GetFeedbackOk returns a tuple with the Feedback field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedback

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) SetFeedback(v int32)`

SetFeedback sets Feedback field to given value.


### GetGuestid

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) GetGuestid() string`

GetGuestid returns the Guestid field if non-nil, zero value otherwise.

### GetGuestidOk

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) GetGuestidOk() (*string, bool)`

GetGuestidOk returns a tuple with the Guestid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuestid

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) SetGuestid(v string)`

SetGuestid sets Guestid field to given value.


### GetId

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) SetId(v int32)`

SetId sets Id field to given value.


### GetRandomResponse

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) GetRandomResponse() int32`

GetRandomResponse returns the RandomResponse field if non-nil, zero value otherwise.

### GetRandomResponseOk

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) GetRandomResponseOk() (*int32, bool)`

GetRandomResponseOk returns a tuple with the RandomResponse field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRandomResponse

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) SetRandomResponse(v int32)`

SetRandomResponse sets RandomResponse field to given value.


### GetTimemodified

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetUserid

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModFeedbackGetCurrentCompletedTmp200ResponseFeedback) SetUserid(v int32)`

SetUserid sets Userid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


