# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_assign_get_user_mappings200_response_assignments_inner import ModAssignGetUserMappings200ResponseAssignmentsInner

class TestModAssignGetUserMappings200ResponseAssignmentsInner(unittest.TestCase):
    """ModAssignGetUserMappings200ResponseAssignmentsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModAssignGetUserMappings200ResponseAssignmentsInner:
        """Test ModAssignGetUserMappings200ResponseAssignmentsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModAssignGetUserMappings200ResponseAssignmentsInner`
        """
        model = ModAssignGetUserMappings200ResponseAssignmentsInner()
        if include_optional:
            return ModAssignGetUserMappings200ResponseAssignmentsInner(
                assignmentid = 56,
                mappings = [
                    openapi_client.models.mod_assign_get_user_mappings_200_response_assignments_inner_mappings_inner.mod_assign_get_user_mappings_200_response_assignments_inner_mappings_inner(
                        id = 56, 
                        userid = 56, )
                    ]
            )
        else:
            return ModAssignGetUserMappings200ResponseAssignmentsInner(
        )
        """

    def testModAssignGetUserMappings200ResponseAssignmentsInner(self):
        """Test ModAssignGetUserMappings200ResponseAssignmentsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()