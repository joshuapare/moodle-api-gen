# CoreMessageSearchContactsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Onlymycourses** | Pointer to **bool** | Limit search to the user&#39;s courses | [optional] [default to false]
**Searchtext** | **string** | String the user&#39;s fullname has to match to be found | [default to "null"]

## Methods

### NewCoreMessageSearchContactsRequest

`func NewCoreMessageSearchContactsRequest(searchtext string, ) *CoreMessageSearchContactsRequest`

NewCoreMessageSearchContactsRequest instantiates a new CoreMessageSearchContactsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreMessageSearchContactsRequestWithDefaults

`func NewCoreMessageSearchContactsRequestWithDefaults() *CoreMessageSearchContactsRequest`

NewCoreMessageSearchContactsRequestWithDefaults instantiates a new CoreMessageSearchContactsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOnlymycourses

`func (o *CoreMessageSearchContactsRequest) GetOnlymycourses() bool`

GetOnlymycourses returns the Onlymycourses field if non-nil, zero value otherwise.

### GetOnlymycoursesOk

`func (o *CoreMessageSearchContactsRequest) GetOnlymycoursesOk() (*bool, bool)`

GetOnlymycoursesOk returns a tuple with the Onlymycourses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOnlymycourses

`func (o *CoreMessageSearchContactsRequest) SetOnlymycourses(v bool)`

SetOnlymycourses sets Onlymycourses field to given value.

### HasOnlymycourses

`func (o *CoreMessageSearchContactsRequest) HasOnlymycourses() bool`

HasOnlymycourses returns a boolean if a field has been set.

### GetSearchtext

`func (o *CoreMessageSearchContactsRequest) GetSearchtext() string`

GetSearchtext returns the Searchtext field if non-nil, zero value otherwise.

### GetSearchtextOk

`func (o *CoreMessageSearchContactsRequest) GetSearchtextOk() (*string, bool)`

GetSearchtextOk returns a tuple with the Searchtext field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSearchtext

`func (o *CoreMessageSearchContactsRequest) SetSearchtext(v string)`

SetSearchtext sets Searchtext field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


