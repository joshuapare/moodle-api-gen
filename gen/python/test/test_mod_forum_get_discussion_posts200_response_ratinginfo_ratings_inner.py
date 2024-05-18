# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_forum_get_discussion_posts200_response_ratinginfo_ratings_inner import ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner

class TestModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner(unittest.TestCase):
    """ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner:
        """Test ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner`
        """
        model = ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner()
        if include_optional:
            return ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner(
                aggregate = 1.337,
                aggregatelabel = '',
                aggregatestr = '',
                canrate = True,
                canviewaggregate = True,
                count = 56,
                itemid = 56,
                rating = 56,
                scaleid = 56,
                userid = 56
            )
        else:
            return ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner(
        )
        """

    def testModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner(self):
        """Test ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()