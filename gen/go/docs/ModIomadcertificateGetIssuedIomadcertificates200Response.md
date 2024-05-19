# ModIomadcertificateGetIssuedIomadcertificates200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Issues** | [**[]ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner**](ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModIomadcertificateGetIssuedIomadcertificates200Response

`func NewModIomadcertificateGetIssuedIomadcertificates200Response(issues []ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner, ) *ModIomadcertificateGetIssuedIomadcertificates200Response`

NewModIomadcertificateGetIssuedIomadcertificates200Response instantiates a new ModIomadcertificateGetIssuedIomadcertificates200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModIomadcertificateGetIssuedIomadcertificates200ResponseWithDefaults

`func NewModIomadcertificateGetIssuedIomadcertificates200ResponseWithDefaults() *ModIomadcertificateGetIssuedIomadcertificates200Response`

NewModIomadcertificateGetIssuedIomadcertificates200ResponseWithDefaults instantiates a new ModIomadcertificateGetIssuedIomadcertificates200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIssues

`func (o *ModIomadcertificateGetIssuedIomadcertificates200Response) GetIssues() []ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner`

GetIssues returns the Issues field if non-nil, zero value otherwise.

### GetIssuesOk

`func (o *ModIomadcertificateGetIssuedIomadcertificates200Response) GetIssuesOk() (*[]ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner, bool)`

GetIssuesOk returns a tuple with the Issues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssues

`func (o *ModIomadcertificateGetIssuedIomadcertificates200Response) SetIssues(v []ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner)`

SetIssues sets Issues field to given value.


### GetWarnings

`func (o *ModIomadcertificateGetIssuedIomadcertificates200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModIomadcertificateGetIssuedIomadcertificates200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModIomadcertificateGetIssuedIomadcertificates200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModIomadcertificateGetIssuedIomadcertificates200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


