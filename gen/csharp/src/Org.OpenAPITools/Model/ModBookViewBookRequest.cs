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
    /// ModBookViewBookRequest
    /// </summary>
    [DataContract(Name = "mod_book_view_book_request")]
    public partial class ModBookViewBookRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModBookViewBookRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModBookViewBookRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModBookViewBookRequest" /> class.
        /// </summary>
        /// <param name="bookid">book instance id (required) (default to null).</param>
        /// <param name="chapterid">chapter id (default to 0).</param>
        public ModBookViewBookRequest(int bookid = null, int chapterid = 0)
        {
            this.Bookid = bookid;
            this.Chapterid = chapterid;
        }

        /// <summary>
        /// book instance id
        /// </summary>
        /// <value>book instance id</value>
        [DataMember(Name = "bookid", IsRequired = true, EmitDefaultValue = true)]
        public int Bookid { get; set; }

        /// <summary>
        /// chapter id
        /// </summary>
        /// <value>chapter id</value>
        [DataMember(Name = "chapterid", EmitDefaultValue = false)]
        public int Chapterid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModBookViewBookRequest {\n");
            sb.Append("  Bookid: ").Append(Bookid).Append("\n");
            sb.Append("  Chapterid: ").Append(Chapterid).Append("\n");
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
