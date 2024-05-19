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
    /// CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner
    /// </summary>
    [DataContract(Name = "core_badges_get_user_badge_by_hash_200_response_badge_inner_relatedbadges_inner")]
    public partial class CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner" /> class.
        /// </summary>
        /// <param name="id">Badge id.</param>
        /// <param name="language">Language.</param>
        /// <param name="name">Badge name.</param>
        /// <param name="type">Type (default to null).</param>
        /// <param name="varVersion">Version (default to &quot;null&quot;).</param>
        public CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner(int id = default(int), string language = default(string), string name = default(string), int type = null, string varVersion = @"null")
        {
            this.Id = id;
            this.Language = language;
            this.Name = name;
            this.Type = type;
            // use default value if no "varVersion" provided
            this.VarVersion = varVersion ?? @"null";
        }

        /// <summary>
        /// Badge id
        /// </summary>
        /// <value>Badge id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Language
        /// </summary>
        /// <value>Language</value>
        [DataMember(Name = "language", EmitDefaultValue = false)]
        public string Language { get; set; }

        /// <summary>
        /// Badge name
        /// </summary>
        /// <value>Badge name</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Type
        /// </summary>
        /// <value>Type</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public int Type { get; set; }

        /// <summary>
        /// Version
        /// </summary>
        /// <value>Version</value>
        [DataMember(Name = "version", EmitDefaultValue = false)]
        public string VarVersion { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Language: ").Append(Language).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  VarVersion: ").Append(VarVersion).Append("\n");
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
