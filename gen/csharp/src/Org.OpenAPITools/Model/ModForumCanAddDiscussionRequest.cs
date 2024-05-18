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
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ModForumCanAddDiscussionRequest
    /// </summary>
    [DataContract(Name = "mod_forum_can_add_discussion_request")]
    public partial class ModForumCanAddDiscussionRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumCanAddDiscussionRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModForumCanAddDiscussionRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumCanAddDiscussionRequest" /> class.
        /// </summary>
        /// <param name="forumid">Forum instance ID (required).</param>
        /// <param name="groupid">The group to check, default to active group.                                                 Use -1 to check if the user can post in all the groups. (default to null).</param>
        public ModForumCanAddDiscussionRequest(int forumid = default(int), int groupid = null)
        {
            this.Forumid = forumid;
            this.Groupid = groupid;
        }

        /// <summary>
        /// Forum instance ID
        /// </summary>
        /// <value>Forum instance ID</value>
        [DataMember(Name = "forumid", IsRequired = true, EmitDefaultValue = true)]
        public int Forumid { get; set; }

        /// <summary>
        /// The group to check, default to active group.                                                 Use -1 to check if the user can post in all the groups.
        /// </summary>
        /// <value>The group to check, default to active group.                                                 Use -1 to check if the user can post in all the groups.</value>
        [DataMember(Name = "groupid", EmitDefaultValue = false)]
        public int Groupid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModForumCanAddDiscussionRequest {\n");
            sb.Append("  Forumid: ").Append(Forumid).Append("\n");
            sb.Append("  Groupid: ").Append(Groupid).Append("\n");
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
