/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner
    /// </summary>
    [DataContract(Name = "mod_forum_get_discussion_posts_by_userid_200_response_discussions_inner")]
    public partial class ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner" /> class.
        /// </summary>
        /// <param name="authorfullname">Full name of the user that started the discussion (default to &quot;null&quot;).</param>
        /// <param name="id">ID of the discussion (default to null).</param>
        /// <param name="name">Name of the discussion (default to &quot;null&quot;).</param>
        /// <param name="posts">posts.</param>
        /// <param name="timecreated">Timestamp of the discussion start (default to null).</param>
        public ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner(string authorfullname = @"null", int id = null, string name = @"null", ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts posts = default(ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts), int timecreated = null)
        {
            // use default value if no "authorfullname" provided
            this.Authorfullname = authorfullname ?? @"null";
            this.Id = id;
            // use default value if no "name" provided
            this.Name = name ?? @"null";
            this.Posts = posts;
            this.Timecreated = timecreated;
        }

        /// <summary>
        /// Full name of the user that started the discussion
        /// </summary>
        /// <value>Full name of the user that started the discussion</value>
        [DataMember(Name = "authorfullname", EmitDefaultValue = false)]
        public string Authorfullname { get; set; }

        /// <summary>
        /// ID of the discussion
        /// </summary>
        /// <value>ID of the discussion</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Name of the discussion
        /// </summary>
        /// <value>Name of the discussion</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Posts
        /// </summary>
        [DataMember(Name = "posts", EmitDefaultValue = false)]
        public ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts Posts { get; set; }

        /// <summary>
        /// Timestamp of the discussion start
        /// </summary>
        /// <value>Timestamp of the discussion start</value>
        [DataMember(Name = "timecreated", EmitDefaultValue = false)]
        public int Timecreated { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner {\n");
            sb.Append("  Authorfullname: ").Append(Authorfullname).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Posts: ").Append(Posts).Append("\n");
            sb.Append("  Timecreated: ").Append(Timecreated).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}