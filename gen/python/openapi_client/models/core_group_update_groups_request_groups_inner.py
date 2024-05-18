# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.core_cohort_update_cohorts_request_cohorts_inner_customfields_inner import CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner
from typing import Optional, Set
from typing_extensions import Self

class CoreGroupUpdateGroupsRequestGroupsInner(BaseModel):
    """
    CoreGroupUpdateGroupsRequestGroupsInner
    """ # noqa: E501
    customfields: Optional[List[CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner]] = None
    description: Optional[StrictStr] = Field(default=None, description="group description text")
    descriptionformat: Optional[StrictInt] = Field(default=1, description="description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)")
    enrolmentkey: Optional[StrictStr] = Field(default=None, description="group enrol secret phrase")
    id: Optional[StrictInt] = Field(default=null, description="ID of the group")
    idnumber: Optional[StrictStr] = Field(default=None, description="id number")
    name: Optional[StrictStr] = Field(default=None, description="multilang compatible name, course unique")
    participation: Optional[StrictBool] = Field(default=False, description="activity participation enabled? Only for \"all\" and \"members\" visibility")
    visibility: Optional[StrictStr] = Field(default='null', description="group visibility mode. 0 = Visible to all. 1 = Visible to members. 2 = See own membership. 3 = Membership is hidden.")
    __properties: ClassVar[List[str]] = ["customfields", "description", "descriptionformat", "enrolmentkey", "id", "idnumber", "name", "participation", "visibility"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of CoreGroupUpdateGroupsRequestGroupsInner from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of each item in customfields (list)
        _items = []
        if self.customfields:
            for _item in self.customfields:
                if _item:
                    _items.append(_item.to_dict())
            _dict['customfields'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CoreGroupUpdateGroupsRequestGroupsInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "customfields": [CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.from_dict(_item) for _item in obj["customfields"]] if obj.get("customfields") is not None else None,
            "description": obj.get("description"),
            "descriptionformat": obj.get("descriptionformat") if obj.get("descriptionformat") is not None else 1,
            "enrolmentkey": obj.get("enrolmentkey"),
            "id": obj.get("id") if obj.get("id") is not None else null,
            "idnumber": obj.get("idnumber"),
            "name": obj.get("name"),
            "participation": obj.get("participation") if obj.get("participation") is not None else False,
            "visibility": obj.get("visibility") if obj.get("visibility") is not None else 'null'
        })
        return _obj


