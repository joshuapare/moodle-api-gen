# ToolMoodlenetVerifyWebfinger200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Domain** | Pointer to **string** | Domain to redirect the user to | [optional] [default to "null"]
**Message** | **string** | Our message for the user | [default to "null"]
**Result** | **bool** | Was the passed content a valid WebFinger? | [default to null]

## Methods

### NewToolMoodlenetVerifyWebfinger200Response

`func NewToolMoodlenetVerifyWebfinger200Response(message string, result bool, ) *ToolMoodlenetVerifyWebfinger200Response`

NewToolMoodlenetVerifyWebfinger200Response instantiates a new ToolMoodlenetVerifyWebfinger200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewToolMoodlenetVerifyWebfinger200ResponseWithDefaults

`func NewToolMoodlenetVerifyWebfinger200ResponseWithDefaults() *ToolMoodlenetVerifyWebfinger200Response`

NewToolMoodlenetVerifyWebfinger200ResponseWithDefaults instantiates a new ToolMoodlenetVerifyWebfinger200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDomain

`func (o *ToolMoodlenetVerifyWebfinger200Response) GetDomain() string`

GetDomain returns the Domain field if non-nil, zero value otherwise.

### GetDomainOk

`func (o *ToolMoodlenetVerifyWebfinger200Response) GetDomainOk() (*string, bool)`

GetDomainOk returns a tuple with the Domain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDomain

`func (o *ToolMoodlenetVerifyWebfinger200Response) SetDomain(v string)`

SetDomain sets Domain field to given value.

### HasDomain

`func (o *ToolMoodlenetVerifyWebfinger200Response) HasDomain() bool`

HasDomain returns a boolean if a field has been set.

### GetMessage

`func (o *ToolMoodlenetVerifyWebfinger200Response) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ToolMoodlenetVerifyWebfinger200Response) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ToolMoodlenetVerifyWebfinger200Response) SetMessage(v string)`

SetMessage sets Message field to given value.


### GetResult

`func (o *ToolMoodlenetVerifyWebfinger200Response) GetResult() bool`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *ToolMoodlenetVerifyWebfinger200Response) GetResultOk() (*bool, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *ToolMoodlenetVerifyWebfinger200Response) SetResult(v bool)`

SetResult sets Result field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


