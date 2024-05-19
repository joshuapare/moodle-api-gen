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
    /// CoreTagUpdateTagsRequestTagsInner
    /// </summary>
    [DataContract(Name = "core_tag_update_tags_request_tags_inner")]
    public partial class CoreTagUpdateTagsRequestTagsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreTagUpdateTagsRequestTagsInner" /> class.
        /// </summary>
        /// <param name="description">tag description.</param>
        /// <param name="descriptionformat">tag description format (default to null).</param>
        /// <param name="flag">flag.</param>
        /// <param name="id">tag id.</param>
        /// <param name="isstandard">whether this flag is standard.</param>
        /// <param name="official">(deprecated, use isstandard) whether this flag is standard (default to null).</param>
        /// <param name="rawname">tag raw name (may contain capital letters).</param>
        public CoreTagUpdateTagsRequestTagsInner(string description = default(string), int descriptionformat = null, int flag = default(int), int id = default(int), int isstandard = default(int), int official = null, string rawname = default(string))
        {
            this.Description = description;
            this.Descriptionformat = descriptionformat;
            this.Flag = flag;
            this.Id = id;
            this.Isstandard = isstandard;
            this.Official = official;
            this.Rawname = rawname;
        }

        /// <summary>
        /// tag description
        /// </summary>
        /// <value>tag description</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// tag description format
        /// </summary>
        /// <value>tag description format</value>
        [DataMember(Name = "descriptionformat", EmitDefaultValue = false)]
        public int Descriptionformat { get; set; }

        /// <summary>
        /// flag
        /// </summary>
        /// <value>flag</value>
        [DataMember(Name = "flag", EmitDefaultValue = false)]
        public int Flag { get; set; }

        /// <summary>
        /// tag id
        /// </summary>
        /// <value>tag id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// whether this flag is standard
        /// </summary>
        /// <value>whether this flag is standard</value>
        [DataMember(Name = "isstandard", EmitDefaultValue = false)]
        public int Isstandard { get; set; }

        /// <summary>
        /// (deprecated, use isstandard) whether this flag is standard
        /// </summary>
        /// <value>(deprecated, use isstandard) whether this flag is standard</value>
        [DataMember(Name = "official", EmitDefaultValue = false)]
        public int Official { get; set; }

        /// <summary>
        /// tag raw name (may contain capital letters)
        /// </summary>
        /// <value>tag raw name (may contain capital letters)</value>
        [DataMember(Name = "rawname", EmitDefaultValue = false)]
        public string Rawname { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreTagUpdateTagsRequestTagsInner {\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Descriptionformat: ").Append(Descriptionformat).Append("\n");
            sb.Append("  Flag: ").Append(Flag).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Isstandard: ").Append(Isstandard).Append("\n");
            sb.Append("  Official: ").Append(Official).Append("\n");
            sb.Append("  Rawname: ").Append(Rawname).Append("\n");
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
