# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_assign_get_user_flags200_response_assignments_inner import ModAssignGetUserFlags200ResponseAssignmentsInner

class TestModAssignGetUserFlags200ResponseAssignmentsInner(unittest.TestCase):
    """ModAssignGetUserFlags200ResponseAssignmentsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModAssignGetUserFlags200ResponseAssignmentsInner:
        """Test ModAssignGetUserFlags200ResponseAssignmentsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModAssignGetUserFlags200ResponseAssignmentsInner`
        """
        model = ModAssignGetUserFlags200ResponseAssignmentsInner()
        if include_optional:
            return ModAssignGetUserFlags200ResponseAssignmentsInner(
                assignmentid = 56,
                userflags = [
                    openapi_client.models.mod_assign_get_user_flags_200_response_assignments_inner_userflags_inner.mod_assign_get_user_flags_200_response_assignments_inner_userflags_inner(
                        allocatedmarker = 56, 
                        extensionduedate = 56, 
                        id = 56, 
                        locked = 56, 
                        mailed = 56, 
                        userid = 56, 
                        workflowstate = 'null', )
                    ]
            )
        else:
            return ModAssignGetUserFlags200ResponseAssignmentsInner(
        )
        """

    def testModAssignGetUserFlags200ResponseAssignmentsInner(self):
        """Test ModAssignGetUserFlags200ResponseAssignmentsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
