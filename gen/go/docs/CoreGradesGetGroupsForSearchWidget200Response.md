# CoreGradesGetGroupsForSearchWidget200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Groups** | [**[]CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner**](CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreGradesGetGroupsForSearchWidget200Response

`func NewCoreGradesGetGroupsForSearchWidget200Response(groups []CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner, ) *CoreGradesGetGroupsForSearchWidget200Response`

NewCoreGradesGetGroupsForSearchWidget200Response instantiates a new CoreGradesGetGroupsForSearchWidget200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradesGetGroupsForSearchWidget200ResponseWithDefaults

`func NewCoreGradesGetGroupsForSearchWidget200ResponseWithDefaults() *CoreGradesGetGroupsForSearchWidget200Response`

NewCoreGradesGetGroupsForSearchWidget200ResponseWithDefaults instantiates a new CoreGradesGetGroupsForSearchWidget200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGroups

`func (o *CoreGradesGetGroupsForSearchWidget200Response) GetGroups() []CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner`

GetGroups returns the Groups field if non-nil, zero value otherwise.

### GetGroupsOk

`func (o *CoreGradesGetGroupsForSearchWidget200Response) GetGroupsOk() (*[]CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner, bool)`

GetGroupsOk returns a tuple with the Groups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroups

`func (o *CoreGradesGetGroupsForSearchWidget200Response) SetGroups(v []CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner)`

SetGroups sets Groups field to given value.


### GetWarnings

`func (o *CoreGradesGetGroupsForSearchWidget200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreGradesGetGroupsForSearchWidget200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreGradesGetGroupsForSearchWidget200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreGradesGetGroupsForSearchWidget200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


