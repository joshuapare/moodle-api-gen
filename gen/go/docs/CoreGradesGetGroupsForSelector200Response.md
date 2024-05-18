# CoreGradesGetGroupsForSelector200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Groups** | [**[]CoreGradesGetGroupsForSelector200ResponseGroupsInner**](CoreGradesGetGroupsForSelector200ResponseGroupsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreGradesGetGroupsForSelector200Response

`func NewCoreGradesGetGroupsForSelector200Response(groups []CoreGradesGetGroupsForSelector200ResponseGroupsInner, ) *CoreGradesGetGroupsForSelector200Response`

NewCoreGradesGetGroupsForSelector200Response instantiates a new CoreGradesGetGroupsForSelector200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradesGetGroupsForSelector200ResponseWithDefaults

`func NewCoreGradesGetGroupsForSelector200ResponseWithDefaults() *CoreGradesGetGroupsForSelector200Response`

NewCoreGradesGetGroupsForSelector200ResponseWithDefaults instantiates a new CoreGradesGetGroupsForSelector200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGroups

`func (o *CoreGradesGetGroupsForSelector200Response) GetGroups() []CoreGradesGetGroupsForSelector200ResponseGroupsInner`

GetGroups returns the Groups field if non-nil, zero value otherwise.

### GetGroupsOk

`func (o *CoreGradesGetGroupsForSelector200Response) GetGroupsOk() (*[]CoreGradesGetGroupsForSelector200ResponseGroupsInner, bool)`

GetGroupsOk returns a tuple with the Groups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroups

`func (o *CoreGradesGetGroupsForSelector200Response) SetGroups(v []CoreGradesGetGroupsForSelector200ResponseGroupsInner)`

SetGroups sets Groups field to given value.


### GetWarnings

`func (o *CoreGradesGetGroupsForSelector200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreGradesGetGroupsForSelector200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreGradesGetGroupsForSelector200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreGradesGetGroupsForSelector200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


