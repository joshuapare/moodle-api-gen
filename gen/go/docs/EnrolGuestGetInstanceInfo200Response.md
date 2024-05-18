# EnrolGuestGetInstanceInfo200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Instanceinfo** | [**EnrolGuestGetInstanceInfo200ResponseInstanceinfo**](EnrolGuestGetInstanceInfo200ResponseInstanceinfo.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewEnrolGuestGetInstanceInfo200Response

`func NewEnrolGuestGetInstanceInfo200Response(instanceinfo EnrolGuestGetInstanceInfo200ResponseInstanceinfo, ) *EnrolGuestGetInstanceInfo200Response`

NewEnrolGuestGetInstanceInfo200Response instantiates a new EnrolGuestGetInstanceInfo200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEnrolGuestGetInstanceInfo200ResponseWithDefaults

`func NewEnrolGuestGetInstanceInfo200ResponseWithDefaults() *EnrolGuestGetInstanceInfo200Response`

NewEnrolGuestGetInstanceInfo200ResponseWithDefaults instantiates a new EnrolGuestGetInstanceInfo200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInstanceinfo

`func (o *EnrolGuestGetInstanceInfo200Response) GetInstanceinfo() EnrolGuestGetInstanceInfo200ResponseInstanceinfo`

GetInstanceinfo returns the Instanceinfo field if non-nil, zero value otherwise.

### GetInstanceinfoOk

`func (o *EnrolGuestGetInstanceInfo200Response) GetInstanceinfoOk() (*EnrolGuestGetInstanceInfo200ResponseInstanceinfo, bool)`

GetInstanceinfoOk returns a tuple with the Instanceinfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceinfo

`func (o *EnrolGuestGetInstanceInfo200Response) SetInstanceinfo(v EnrolGuestGetInstanceInfo200ResponseInstanceinfo)`

SetInstanceinfo sets Instanceinfo field to given value.


### GetWarnings

`func (o *EnrolGuestGetInstanceInfo200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *EnrolGuestGetInstanceInfo200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *EnrolGuestGetInstanceInfo200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *EnrolGuestGetInstanceInfo200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


