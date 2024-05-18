# LocalIomadLearningpathGetprospectiveusersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Companyid** | **int32** | ID of Iomad Company | [default to null]
**Filter** | Pointer to **string** | Filter user list returned | [optional] [default to ""]
**Pathid** | **int32** | ID learning path | [default to null]
**Profilefieldid** | Pointer to **int32** | Filter by user profilefield | [optional] [default to 0]

## Methods

### NewLocalIomadLearningpathGetprospectiveusersRequest

`func NewLocalIomadLearningpathGetprospectiveusersRequest(companyid int32, pathid int32, ) *LocalIomadLearningpathGetprospectiveusersRequest`

NewLocalIomadLearningpathGetprospectiveusersRequest instantiates a new LocalIomadLearningpathGetprospectiveusersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocalIomadLearningpathGetprospectiveusersRequestWithDefaults

`func NewLocalIomadLearningpathGetprospectiveusersRequestWithDefaults() *LocalIomadLearningpathGetprospectiveusersRequest`

NewLocalIomadLearningpathGetprospectiveusersRequestWithDefaults instantiates a new LocalIomadLearningpathGetprospectiveusersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompanyid

`func (o *LocalIomadLearningpathGetprospectiveusersRequest) GetCompanyid() int32`

GetCompanyid returns the Companyid field if non-nil, zero value otherwise.

### GetCompanyidOk

`func (o *LocalIomadLearningpathGetprospectiveusersRequest) GetCompanyidOk() (*int32, bool)`

GetCompanyidOk returns a tuple with the Companyid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompanyid

`func (o *LocalIomadLearningpathGetprospectiveusersRequest) SetCompanyid(v int32)`

SetCompanyid sets Companyid field to given value.


### GetFilter

`func (o *LocalIomadLearningpathGetprospectiveusersRequest) GetFilter() string`

GetFilter returns the Filter field if non-nil, zero value otherwise.

### GetFilterOk

`func (o *LocalIomadLearningpathGetprospectiveusersRequest) GetFilterOk() (*string, bool)`

GetFilterOk returns a tuple with the Filter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilter

`func (o *LocalIomadLearningpathGetprospectiveusersRequest) SetFilter(v string)`

SetFilter sets Filter field to given value.

### HasFilter

`func (o *LocalIomadLearningpathGetprospectiveusersRequest) HasFilter() bool`

HasFilter returns a boolean if a field has been set.

### GetPathid

`func (o *LocalIomadLearningpathGetprospectiveusersRequest) GetPathid() int32`

GetPathid returns the Pathid field if non-nil, zero value otherwise.

### GetPathidOk

`func (o *LocalIomadLearningpathGetprospectiveusersRequest) GetPathidOk() (*int32, bool)`

GetPathidOk returns a tuple with the Pathid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPathid

`func (o *LocalIomadLearningpathGetprospectiveusersRequest) SetPathid(v int32)`

SetPathid sets Pathid field to given value.


### GetProfilefieldid

`func (o *LocalIomadLearningpathGetprospectiveusersRequest) GetProfilefieldid() int32`

GetProfilefieldid returns the Profilefieldid field if non-nil, zero value otherwise.

### GetProfilefieldidOk

`func (o *LocalIomadLearningpathGetprospectiveusersRequest) GetProfilefieldidOk() (*int32, bool)`

GetProfilefieldidOk returns a tuple with the Profilefieldid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfilefieldid

`func (o *LocalIomadLearningpathGetprospectiveusersRequest) SetProfilefieldid(v int32)`

SetProfilefieldid sets Profilefieldid field to given value.

### HasProfilefieldid

`func (o *LocalIomadLearningpathGetprospectiveusersRequest) HasProfilefieldid() bool`

HasProfilefieldid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


