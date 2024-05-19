# ModLtiGetToolLaunchData200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Endpoint** | **string** | Endpoint URL | [default to "null"]
**Parameters** | [**[]ModLtiGetToolLaunchData200ResponseParametersInner**](ModLtiGetToolLaunchData200ResponseParametersInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModLtiGetToolLaunchData200Response

`func NewModLtiGetToolLaunchData200Response(endpoint string, parameters []ModLtiGetToolLaunchData200ResponseParametersInner, ) *ModLtiGetToolLaunchData200Response`

NewModLtiGetToolLaunchData200Response instantiates a new ModLtiGetToolLaunchData200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModLtiGetToolLaunchData200ResponseWithDefaults

`func NewModLtiGetToolLaunchData200ResponseWithDefaults() *ModLtiGetToolLaunchData200Response`

NewModLtiGetToolLaunchData200ResponseWithDefaults instantiates a new ModLtiGetToolLaunchData200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEndpoint

`func (o *ModLtiGetToolLaunchData200Response) GetEndpoint() string`

GetEndpoint returns the Endpoint field if non-nil, zero value otherwise.

### GetEndpointOk

`func (o *ModLtiGetToolLaunchData200Response) GetEndpointOk() (*string, bool)`

GetEndpointOk returns a tuple with the Endpoint field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndpoint

`func (o *ModLtiGetToolLaunchData200Response) SetEndpoint(v string)`

SetEndpoint sets Endpoint field to given value.


### GetParameters

`func (o *ModLtiGetToolLaunchData200Response) GetParameters() []ModLtiGetToolLaunchData200ResponseParametersInner`

GetParameters returns the Parameters field if non-nil, zero value otherwise.

### GetParametersOk

`func (o *ModLtiGetToolLaunchData200Response) GetParametersOk() (*[]ModLtiGetToolLaunchData200ResponseParametersInner, bool)`

GetParametersOk returns a tuple with the Parameters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParameters

`func (o *ModLtiGetToolLaunchData200Response) SetParameters(v []ModLtiGetToolLaunchData200ResponseParametersInner)`

SetParameters sets Parameters field to given value.


### GetWarnings

`func (o *ModLtiGetToolLaunchData200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModLtiGetToolLaunchData200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModLtiGetToolLaunchData200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModLtiGetToolLaunchData200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


