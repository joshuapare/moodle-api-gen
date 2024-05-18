# CoreCalendarGetCalendarExportToken200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Token** | **string** | The calendar permanent access token for calendar export. | [default to "null"]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreCalendarGetCalendarExportToken200Response

`func NewCoreCalendarGetCalendarExportToken200Response(token string, ) *CoreCalendarGetCalendarExportToken200Response`

NewCoreCalendarGetCalendarExportToken200Response instantiates a new CoreCalendarGetCalendarExportToken200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetCalendarExportToken200ResponseWithDefaults

`func NewCoreCalendarGetCalendarExportToken200ResponseWithDefaults() *CoreCalendarGetCalendarExportToken200Response`

NewCoreCalendarGetCalendarExportToken200ResponseWithDefaults instantiates a new CoreCalendarGetCalendarExportToken200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetToken

`func (o *CoreCalendarGetCalendarExportToken200Response) GetToken() string`

GetToken returns the Token field if non-nil, zero value otherwise.

### GetTokenOk

`func (o *CoreCalendarGetCalendarExportToken200Response) GetTokenOk() (*string, bool)`

GetTokenOk returns a tuple with the Token field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToken

`func (o *CoreCalendarGetCalendarExportToken200Response) SetToken(v string)`

SetToken sets Token field to given value.


### GetWarnings

`func (o *CoreCalendarGetCalendarExportToken200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreCalendarGetCalendarExportToken200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreCalendarGetCalendarExportToken200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreCalendarGetCalendarExportToken200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


