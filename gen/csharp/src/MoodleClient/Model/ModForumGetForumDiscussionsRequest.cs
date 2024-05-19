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
    /// ModForumGetForumDiscussionsRequest
    /// </summary>
    [DataContract(Name = "mod_forum_get_forum_discussions_request")]
    public partial class ModForumGetForumDiscussionsRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumGetForumDiscussionsRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModForumGetForumDiscussionsRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumGetForumDiscussionsRequest" /> class.
        /// </summary>
        /// <param name="forumid">forum instance id (required) (default to null).</param>
        /// <param name="groupid">group id (default to 0).</param>
        /// <param name="page">current page (default to -1).</param>
        /// <param name="perpage">items per page (default to 0).</param>
        /// <param name="sortorder">sort by this element: numreplies, , created or timemodified (default to -1).</param>
        public ModForumGetForumDiscussionsRequest(int forumid = null, int groupid = 0, int page = -1, int perpage = 0, int sortorder = -1)
        {
            this.Forumid = forumid;
            this.Groupid = groupid;
            this.Page = page;
            this.Perpage = perpage;
            this.Sortorder = sortorder;
        }

        /// <summary>
        /// forum instance id
        /// </summary>
        /// <value>forum instance id</value>
        [DataMember(Name = "forumid", IsRequired = true, EmitDefaultValue = true)]
        public int Forumid { get; set; }

        /// <summary>
        /// group id
        /// </summary>
        /// <value>group id</value>
        [DataMember(Name = "groupid", EmitDefaultValue = false)]
        public int Groupid { get; set; }

        /// <summary>
        /// current page
        /// </summary>
        /// <value>current page</value>
        [DataMember(Name = "page", EmitDefaultValue = false)]
        public int Page { get; set; }

        /// <summary>
        /// items per page
        /// </summary>
        /// <value>items per page</value>
        [DataMember(Name = "perpage", EmitDefaultValue = false)]
        public int Perpage { get; set; }

        /// <summary>
        /// sort by this element: numreplies, , created or timemodified
        /// </summary>
        /// <value>sort by this element: numreplies, , created or timemodified</value>
        [DataMember(Name = "sortorder", EmitDefaultValue = false)]
        public int Sortorder { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModForumGetForumDiscussionsRequest {\n");
            sb.Append("  Forumid: ").Append(Forumid).Append("\n");
            sb.Append("  Groupid: ").Append(Groupid).Append("\n");
            sb.Append("  Page: ").Append(Page).Append("\n");
            sb.Append("  Perpage: ").Append(Perpage).Append("\n");
            sb.Append("  Sortorder: ").Append(Sortorder).Append("\n");
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
