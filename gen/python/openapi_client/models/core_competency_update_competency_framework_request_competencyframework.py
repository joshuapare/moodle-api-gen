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
from typing import Optional, Set
from typing_extensions import Self

class CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework(BaseModel):
    """
    CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework
    """ # noqa: E501
    contextid: Optional[StrictInt] = Field(default=None, description="The context id")
    contextlevel: Optional[StrictStr] = Field(default=None, description="The context level")
    description: Optional[StrictStr] = Field(default=None, description="description")
    descriptionformat: Optional[StrictInt] = Field(default=1, description="description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)")
    id: StrictInt = Field(description="id")
    idnumber: Optional[StrictStr] = Field(default=None, description="idnumber")
    instanceid: Optional[StrictInt] = Field(default=None, description="The Instance id")
    scaleconfiguration: Optional[StrictStr] = Field(default=None, description="scaleconfiguration")
    scaleid: Optional[StrictInt] = Field(default=None, description="scaleid")
    shortname: Optional[StrictStr] = Field(default=None, description="shortname")
    taxonomies: Optional[StrictStr] = Field(default='null', description="taxonomies")
    timecreated: Optional[StrictInt] = Field(default=None, description="timecreated")
    timemodified: Optional[StrictInt] = Field(default=None, description="timemodified")
    usermodified: Optional[StrictInt] = Field(default=None, description="usermodified")
    visible: Optional[StrictBool] = Field(default=None, description="visible")
    __properties: ClassVar[List[str]] = ["contextid", "contextlevel", "description", "descriptionformat", "id", "idnumber", "instanceid", "scaleconfiguration", "scaleid", "shortname", "taxonomies", "timecreated", "timemodified", "usermodified", "visible"]

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
        """Create an instance of CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "contextid": obj.get("contextid"),
            "contextlevel": obj.get("contextlevel"),
            "description": obj.get("description"),
            "descriptionformat": obj.get("descriptionformat") if obj.get("descriptionformat") is not None else 1,
            "id": obj.get("id"),
            "idnumber": obj.get("idnumber"),
            "instanceid": obj.get("instanceid"),
            "scaleconfiguration": obj.get("scaleconfiguration"),
            "scaleid": obj.get("scaleid"),
            "shortname": obj.get("shortname"),
            "taxonomies": obj.get("taxonomies") if obj.get("taxonomies") is not None else 'null',
            "timecreated": obj.get("timecreated"),
            "timemodified": obj.get("timemodified"),
            "usermodified": obj.get("usermodified"),
            "visible": obj.get("visible")
        })
        return _obj


