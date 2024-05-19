# CoreReportbuilderReportsGet200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Area** | **string** | area | [default to ""]
**Attributes** | [**[]CoreReportbuilderReportsGet200ResponseAttributesInner**](CoreReportbuilderReportsGet200ResponseAttributesInner.md) |  | 
**Cardview** | Pointer to [**CoreReportbuilderReportsGet200ResponseCardview**](CoreReportbuilderReportsGet200ResponseCardview.md) |  | [optional] 
**Classes** | **string** | classes | [default to "null"]
**Component** | **string** | component | [default to ""]
**Conditiondata** | **string** | conditiondata | 
**Conditions** | Pointer to [**CoreReportbuilderConditionsDelete200Response**](CoreReportbuilderConditionsDelete200Response.md) |  | [optional] 
**Contextid** | **int32** | contextid | [default to {}]
**Editmode** | **bool** | editmode | [default to null]
**Filters** | Pointer to [**CoreReportbuilderFiltersDelete200Response**](CoreReportbuilderFiltersDelete200Response.md) |  | [optional] 
**Filtersapplied** | **int32** | filtersapplied | [default to null]
**Filtersform** | **string** | filtersform | [default to "null"]
**Filterspresent** | **bool** | filterspresent | [default to null]
**Id** | **int32** | id | [default to 0]
**Itemid** | **int32** | itemid | [default to 0]
**Javascript** | **string** | javascript | 
**Name** | **string** | name | 
**Settingsdata** | **string** | settingsdata | 
**Sidebarmenucards** | Pointer to [**CoreReportbuilderReportsGet200ResponseSidebarmenucards**](CoreReportbuilderReportsGet200ResponseSidebarmenucards.md) |  | [optional] 
**Sorting** | Pointer to [**CoreReportbuilderColumnsDelete200Response**](CoreReportbuilderColumnsDelete200Response.md) |  | [optional] 
**Source** | **string** | source | 
**Table** | **string** | table | [default to "null"]
**Timecreated** | **int32** | timecreated | [default to 0]
**Timemodified** | **int32** | timemodified | [default to 0]
**Type** | **int32** | type | 
**Uniquerows** | **bool** | uniquerows | [default to false]
**Usercreated** | **int32** | usercreated | [default to {}]
**Usermodified** | **int32** | usermodified | [default to 0]

## Methods

### NewCoreReportbuilderReportsGet200Response

`func NewCoreReportbuilderReportsGet200Response(area string, attributes []CoreReportbuilderReportsGet200ResponseAttributesInner, classes string, component string, conditiondata string, contextid int32, editmode bool, filtersapplied int32, filtersform string, filterspresent bool, id int32, itemid int32, javascript string, name string, settingsdata string, source string, table string, timecreated int32, timemodified int32, type_ int32, uniquerows bool, usercreated int32, usermodified int32, ) *CoreReportbuilderReportsGet200Response`

NewCoreReportbuilderReportsGet200Response instantiates a new CoreReportbuilderReportsGet200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreReportbuilderReportsGet200ResponseWithDefaults

`func NewCoreReportbuilderReportsGet200ResponseWithDefaults() *CoreReportbuilderReportsGet200Response`

NewCoreReportbuilderReportsGet200ResponseWithDefaults instantiates a new CoreReportbuilderReportsGet200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetArea

`func (o *CoreReportbuilderReportsGet200Response) GetArea() string`

GetArea returns the Area field if non-nil, zero value otherwise.

### GetAreaOk

`func (o *CoreReportbuilderReportsGet200Response) GetAreaOk() (*string, bool)`

GetAreaOk returns a tuple with the Area field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArea

`func (o *CoreReportbuilderReportsGet200Response) SetArea(v string)`

SetArea sets Area field to given value.


### GetAttributes

`func (o *CoreReportbuilderReportsGet200Response) GetAttributes() []CoreReportbuilderReportsGet200ResponseAttributesInner`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *CoreReportbuilderReportsGet200Response) GetAttributesOk() (*[]CoreReportbuilderReportsGet200ResponseAttributesInner, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *CoreReportbuilderReportsGet200Response) SetAttributes(v []CoreReportbuilderReportsGet200ResponseAttributesInner)`

SetAttributes sets Attributes field to given value.


### GetCardview

`func (o *CoreReportbuilderReportsGet200Response) GetCardview() CoreReportbuilderReportsGet200ResponseCardview`

GetCardview returns the Cardview field if non-nil, zero value otherwise.

### GetCardviewOk

`func (o *CoreReportbuilderReportsGet200Response) GetCardviewOk() (*CoreReportbuilderReportsGet200ResponseCardview, bool)`

GetCardviewOk returns a tuple with the Cardview field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCardview

`func (o *CoreReportbuilderReportsGet200Response) SetCardview(v CoreReportbuilderReportsGet200ResponseCardview)`

SetCardview sets Cardview field to given value.

### HasCardview

`func (o *CoreReportbuilderReportsGet200Response) HasCardview() bool`

HasCardview returns a boolean if a field has been set.

### GetClasses

`func (o *CoreReportbuilderReportsGet200Response) GetClasses() string`

GetClasses returns the Classes field if non-nil, zero value otherwise.

### GetClassesOk

`func (o *CoreReportbuilderReportsGet200Response) GetClassesOk() (*string, bool)`

GetClassesOk returns a tuple with the Classes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClasses

`func (o *CoreReportbuilderReportsGet200Response) SetClasses(v string)`

SetClasses sets Classes field to given value.


### GetComponent

`func (o *CoreReportbuilderReportsGet200Response) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreReportbuilderReportsGet200Response) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreReportbuilderReportsGet200Response) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetConditiondata

`func (o *CoreReportbuilderReportsGet200Response) GetConditiondata() string`

GetConditiondata returns the Conditiondata field if non-nil, zero value otherwise.

### GetConditiondataOk

`func (o *CoreReportbuilderReportsGet200Response) GetConditiondataOk() (*string, bool)`

GetConditiondataOk returns a tuple with the Conditiondata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConditiondata

`func (o *CoreReportbuilderReportsGet200Response) SetConditiondata(v string)`

SetConditiondata sets Conditiondata field to given value.


### GetConditions

`func (o *CoreReportbuilderReportsGet200Response) GetConditions() CoreReportbuilderConditionsDelete200Response`

GetConditions returns the Conditions field if non-nil, zero value otherwise.

### GetConditionsOk

`func (o *CoreReportbuilderReportsGet200Response) GetConditionsOk() (*CoreReportbuilderConditionsDelete200Response, bool)`

GetConditionsOk returns a tuple with the Conditions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConditions

`func (o *CoreReportbuilderReportsGet200Response) SetConditions(v CoreReportbuilderConditionsDelete200Response)`

SetConditions sets Conditions field to given value.

### HasConditions

`func (o *CoreReportbuilderReportsGet200Response) HasConditions() bool`

HasConditions returns a boolean if a field has been set.

### GetContextid

`func (o *CoreReportbuilderReportsGet200Response) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreReportbuilderReportsGet200Response) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreReportbuilderReportsGet200Response) SetContextid(v int32)`

SetContextid sets Contextid field to given value.


### GetEditmode

`func (o *CoreReportbuilderReportsGet200Response) GetEditmode() bool`

GetEditmode returns the Editmode field if non-nil, zero value otherwise.

### GetEditmodeOk

`func (o *CoreReportbuilderReportsGet200Response) GetEditmodeOk() (*bool, bool)`

GetEditmodeOk returns a tuple with the Editmode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEditmode

`func (o *CoreReportbuilderReportsGet200Response) SetEditmode(v bool)`

SetEditmode sets Editmode field to given value.


### GetFilters

`func (o *CoreReportbuilderReportsGet200Response) GetFilters() CoreReportbuilderFiltersDelete200Response`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CoreReportbuilderReportsGet200Response) GetFiltersOk() (*CoreReportbuilderFiltersDelete200Response, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CoreReportbuilderReportsGet200Response) SetFilters(v CoreReportbuilderFiltersDelete200Response)`

SetFilters sets Filters field to given value.

### HasFilters

`func (o *CoreReportbuilderReportsGet200Response) HasFilters() bool`

HasFilters returns a boolean if a field has been set.

### GetFiltersapplied

`func (o *CoreReportbuilderReportsGet200Response) GetFiltersapplied() int32`

GetFiltersapplied returns the Filtersapplied field if non-nil, zero value otherwise.

### GetFiltersappliedOk

`func (o *CoreReportbuilderReportsGet200Response) GetFiltersappliedOk() (*int32, bool)`

GetFiltersappliedOk returns a tuple with the Filtersapplied field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiltersapplied

`func (o *CoreReportbuilderReportsGet200Response) SetFiltersapplied(v int32)`

SetFiltersapplied sets Filtersapplied field to given value.


### GetFiltersform

`func (o *CoreReportbuilderReportsGet200Response) GetFiltersform() string`

GetFiltersform returns the Filtersform field if non-nil, zero value otherwise.

### GetFiltersformOk

`func (o *CoreReportbuilderReportsGet200Response) GetFiltersformOk() (*string, bool)`

GetFiltersformOk returns a tuple with the Filtersform field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiltersform

`func (o *CoreReportbuilderReportsGet200Response) SetFiltersform(v string)`

SetFiltersform sets Filtersform field to given value.


### GetFilterspresent

`func (o *CoreReportbuilderReportsGet200Response) GetFilterspresent() bool`

GetFilterspresent returns the Filterspresent field if non-nil, zero value otherwise.

### GetFilterspresentOk

`func (o *CoreReportbuilderReportsGet200Response) GetFilterspresentOk() (*bool, bool)`

GetFilterspresentOk returns a tuple with the Filterspresent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilterspresent

`func (o *CoreReportbuilderReportsGet200Response) SetFilterspresent(v bool)`

SetFilterspresent sets Filterspresent field to given value.


### GetId

`func (o *CoreReportbuilderReportsGet200Response) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreReportbuilderReportsGet200Response) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreReportbuilderReportsGet200Response) SetId(v int32)`

SetId sets Id field to given value.


### GetItemid

`func (o *CoreReportbuilderReportsGet200Response) GetItemid() int32`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *CoreReportbuilderReportsGet200Response) GetItemidOk() (*int32, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *CoreReportbuilderReportsGet200Response) SetItemid(v int32)`

SetItemid sets Itemid field to given value.


### GetJavascript

`func (o *CoreReportbuilderReportsGet200Response) GetJavascript() string`

GetJavascript returns the Javascript field if non-nil, zero value otherwise.

### GetJavascriptOk

`func (o *CoreReportbuilderReportsGet200Response) GetJavascriptOk() (*string, bool)`

GetJavascriptOk returns a tuple with the Javascript field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJavascript

`func (o *CoreReportbuilderReportsGet200Response) SetJavascript(v string)`

SetJavascript sets Javascript field to given value.


### GetName

`func (o *CoreReportbuilderReportsGet200Response) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreReportbuilderReportsGet200Response) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreReportbuilderReportsGet200Response) SetName(v string)`

SetName sets Name field to given value.


### GetSettingsdata

`func (o *CoreReportbuilderReportsGet200Response) GetSettingsdata() string`

GetSettingsdata returns the Settingsdata field if non-nil, zero value otherwise.

### GetSettingsdataOk

`func (o *CoreReportbuilderReportsGet200Response) GetSettingsdataOk() (*string, bool)`

GetSettingsdataOk returns a tuple with the Settingsdata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSettingsdata

`func (o *CoreReportbuilderReportsGet200Response) SetSettingsdata(v string)`

SetSettingsdata sets Settingsdata field to given value.


### GetSidebarmenucards

`func (o *CoreReportbuilderReportsGet200Response) GetSidebarmenucards() CoreReportbuilderReportsGet200ResponseSidebarmenucards`

GetSidebarmenucards returns the Sidebarmenucards field if non-nil, zero value otherwise.

### GetSidebarmenucardsOk

`func (o *CoreReportbuilderReportsGet200Response) GetSidebarmenucardsOk() (*CoreReportbuilderReportsGet200ResponseSidebarmenucards, bool)`

GetSidebarmenucardsOk returns a tuple with the Sidebarmenucards field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSidebarmenucards

`func (o *CoreReportbuilderReportsGet200Response) SetSidebarmenucards(v CoreReportbuilderReportsGet200ResponseSidebarmenucards)`

SetSidebarmenucards sets Sidebarmenucards field to given value.

### HasSidebarmenucards

`func (o *CoreReportbuilderReportsGet200Response) HasSidebarmenucards() bool`

HasSidebarmenucards returns a boolean if a field has been set.

### GetSorting

`func (o *CoreReportbuilderReportsGet200Response) GetSorting() CoreReportbuilderColumnsDelete200Response`

GetSorting returns the Sorting field if non-nil, zero value otherwise.

### GetSortingOk

`func (o *CoreReportbuilderReportsGet200Response) GetSortingOk() (*CoreReportbuilderColumnsDelete200Response, bool)`

GetSortingOk returns a tuple with the Sorting field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSorting

`func (o *CoreReportbuilderReportsGet200Response) SetSorting(v CoreReportbuilderColumnsDelete200Response)`

SetSorting sets Sorting field to given value.

### HasSorting

`func (o *CoreReportbuilderReportsGet200Response) HasSorting() bool`

HasSorting returns a boolean if a field has been set.

### GetSource

`func (o *CoreReportbuilderReportsGet200Response) GetSource() string`

GetSource returns the Source field if non-nil, zero value otherwise.

### GetSourceOk

`func (o *CoreReportbuilderReportsGet200Response) GetSourceOk() (*string, bool)`

GetSourceOk returns a tuple with the Source field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSource

`func (o *CoreReportbuilderReportsGet200Response) SetSource(v string)`

SetSource sets Source field to given value.


### GetTable

`func (o *CoreReportbuilderReportsGet200Response) GetTable() string`

GetTable returns the Table field if non-nil, zero value otherwise.

### GetTableOk

`func (o *CoreReportbuilderReportsGet200Response) GetTableOk() (*string, bool)`

GetTableOk returns a tuple with the Table field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTable

`func (o *CoreReportbuilderReportsGet200Response) SetTable(v string)`

SetTable sets Table field to given value.


### GetTimecreated

`func (o *CoreReportbuilderReportsGet200Response) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *CoreReportbuilderReportsGet200Response) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *CoreReportbuilderReportsGet200Response) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.


### GetTimemodified

`func (o *CoreReportbuilderReportsGet200Response) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreReportbuilderReportsGet200Response) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreReportbuilderReportsGet200Response) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetType

`func (o *CoreReportbuilderReportsGet200Response) GetType() int32`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CoreReportbuilderReportsGet200Response) GetTypeOk() (*int32, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CoreReportbuilderReportsGet200Response) SetType(v int32)`

SetType sets Type field to given value.


### GetUniquerows

`func (o *CoreReportbuilderReportsGet200Response) GetUniquerows() bool`

GetUniquerows returns the Uniquerows field if non-nil, zero value otherwise.

### GetUniquerowsOk

`func (o *CoreReportbuilderReportsGet200Response) GetUniquerowsOk() (*bool, bool)`

GetUniquerowsOk returns a tuple with the Uniquerows field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUniquerows

`func (o *CoreReportbuilderReportsGet200Response) SetUniquerows(v bool)`

SetUniquerows sets Uniquerows field to given value.


### GetUsercreated

`func (o *CoreReportbuilderReportsGet200Response) GetUsercreated() int32`

GetUsercreated returns the Usercreated field if non-nil, zero value otherwise.

### GetUsercreatedOk

`func (o *CoreReportbuilderReportsGet200Response) GetUsercreatedOk() (*int32, bool)`

GetUsercreatedOk returns a tuple with the Usercreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsercreated

`func (o *CoreReportbuilderReportsGet200Response) SetUsercreated(v int32)`

SetUsercreated sets Usercreated field to given value.


### GetUsermodified

`func (o *CoreReportbuilderReportsGet200Response) GetUsermodified() int32`

GetUsermodified returns the Usermodified field if non-nil, zero value otherwise.

### GetUsermodifiedOk

`func (o *CoreReportbuilderReportsGet200Response) GetUsermodifiedOk() (*int32, bool)`

GetUsermodifiedOk returns a tuple with the Usermodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsermodified

`func (o *CoreReportbuilderReportsGet200Response) SetUsermodified(v int32)`

SetUsermodified sets Usermodified field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


