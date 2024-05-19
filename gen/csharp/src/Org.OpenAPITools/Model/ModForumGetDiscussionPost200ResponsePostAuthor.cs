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
    /// ModForumGetDiscussionPost200ResponsePostAuthor
    /// </summary>
    [DataContract(Name = "mod_forum_get_discussion_post_200_response_post_author")]
    public partial class ModForumGetDiscussionPost200ResponsePostAuthor : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumGetDiscussionPost200ResponsePostAuthor" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModForumGetDiscussionPost200ResponsePostAuthor() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumGetDiscussionPost200ResponsePostAuthor" /> class.
        /// </summary>
        /// <param name="fullname">fullname.</param>
        /// <param name="groups">groups.</param>
        /// <param name="id">id.</param>
        /// <param name="isdeleted">isdeleted.</param>
        /// <param name="urls">urls (required).</param>
        public ModForumGetDiscussionPost200ResponsePostAuthor(string fullname = default(string), List<ModForumGetDiscussionPost200ResponsePostAuthorGroupsInner> groups = default(List<ModForumGetDiscussionPost200ResponsePostAuthorGroupsInner>), int id = default(int), bool isdeleted = default(bool), ModForumGetDiscussionPost200ResponsePostAuthorUrls urls = default(ModForumGetDiscussionPost200ResponsePostAuthorUrls))
        {
            // to ensure "urls" is required (not null)
            if (urls == null)
            {
                throw new ArgumentNullException("urls is a required property for ModForumGetDiscussionPost200ResponsePostAuthor and cannot be null");
            }
            this.Urls = urls;
            this.Fullname = fullname;
            this.Groups = groups;
            this.Id = id;
            this.Isdeleted = isdeleted;
        }

        /// <summary>
        /// fullname
        /// </summary>
        /// <value>fullname</value>
        [DataMember(Name = "fullname", EmitDefaultValue = false)]
        public string Fullname { get; set; }

        /// <summary>
        /// Gets or Sets Groups
        /// </summary>
        [DataMember(Name = "groups", EmitDefaultValue = false)]
        public List<ModForumGetDiscussionPost200ResponsePostAuthorGroupsInner> Groups { get; set; }

        /// <summary>
        /// id
        /// </summary>
        /// <value>id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// isdeleted
        /// </summary>
        /// <value>isdeleted</value>
        [DataMember(Name = "isdeleted", EmitDefaultValue = true)]
        public bool Isdeleted { get; set; }

        /// <summary>
        /// Gets or Sets Urls
        /// </summary>
        [DataMember(Name = "urls", IsRequired = true, EmitDefaultValue = true)]
        public ModForumGetDiscussionPost200ResponsePostAuthorUrls Urls { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModForumGetDiscussionPost200ResponsePostAuthor {\n");
            sb.Append("  Fullname: ").Append(Fullname).Append("\n");
            sb.Append("  Groups: ").Append(Groups).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Isdeleted: ").Append(Isdeleted).Append("\n");
            sb.Append("  Urls: ").Append(Urls).Append("\n");
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
