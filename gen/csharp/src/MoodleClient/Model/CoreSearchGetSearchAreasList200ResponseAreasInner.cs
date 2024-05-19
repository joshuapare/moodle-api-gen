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
    /// Search area
    /// </summary>
    [DataContract(Name = "core_search_get_search_areas_list_200_response_areas_inner")]
    public partial class CoreSearchGetSearchAreasList200ResponseAreasInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreSearchGetSearchAreasList200ResponseAreasInner" /> class.
        /// </summary>
        /// <param name="categoryid">category id (default to &quot;null&quot;).</param>
        /// <param name="categoryname">category name.</param>
        /// <param name="id">search area id (default to &quot;null&quot;).</param>
        /// <param name="name">search area name (default to &quot;null&quot;).</param>
        public CoreSearchGetSearchAreasList200ResponseAreasInner(string categoryid = @"null", string categoryname = default(string), string id = @"null", string name = @"null")
        {
            // use default value if no "categoryid" provided
            this.Categoryid = categoryid ?? @"null";
            this.Categoryname = categoryname;
            // use default value if no "id" provided
            this.Id = id ?? @"null";
            // use default value if no "name" provided
            this.Name = name ?? @"null";
        }

        /// <summary>
        /// category id
        /// </summary>
        /// <value>category id</value>
        [DataMember(Name = "categoryid", EmitDefaultValue = false)]
        public string Categoryid { get; set; }

        /// <summary>
        /// category name
        /// </summary>
        /// <value>category name</value>
        [DataMember(Name = "categoryname", EmitDefaultValue = false)]
        public string Categoryname { get; set; }

        /// <summary>
        /// search area id
        /// </summary>
        /// <value>search area id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// search area name
        /// </summary>
        /// <value>search area name</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreSearchGetSearchAreasList200ResponseAreasInner {\n");
            sb.Append("  Categoryid: ").Append(Categoryid).Append("\n");
            sb.Append("  Categoryname: ").Append(Categoryname).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
